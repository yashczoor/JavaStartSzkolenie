package pl.javastart.mp3player.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.javastart.mp3player.mp3.Mp3Collection;
import pl.javastart.mp3player.mp3.Mp3Song;

public class ContentPaneController implements Initializable {

	public static final String TITLE_COLUMN = "Tytu�";
	public static final String AUTHOR_COLUMN = "Autor";
	public static final String ALBUM_COLUMN = "Album";
	private Mp3Collection mp3collection;

	@FXML
	private TableView<Mp3Song> contentTable;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		configureTable();
		configureTestMp3();
	}

	private void configureTestMp3() {
		mp3collection = new Mp3Collection();
		getContentTable().setItems(mp3collection.getSongList());

		Mp3Song mp3song = createMp3SongFromPath("Bubliczki - Nie ma si�y.mp3");
		mp3collection.addSong(mp3song);

	}

	private Mp3Song createMp3SongFromPath(String filePath) {
		File file = new File(filePath);
		Mp3Song result = new Mp3Song();
		try {
			MP3File mp3File = new MP3File(file);
			result.setFilePath(file.getAbsolutePath());
			result.setTitle(mp3File.getID3v2Tag().getSongTitle());
			result.setAuthor(mp3File.getID3v2Tag().getLeadArtist());
			result.setAlbum(mp3File.getID3v2Tag().getAlbumTitle());
		} catch(IOException | TagException e) {
			e.printStackTrace();
		}
		return result;
	}

	private void configureTable() {
		TableColumn<Mp3Song, String> titleColumn = new TableColumn<Mp3Song, String>(TITLE_COLUMN);
		titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

		TableColumn<Mp3Song, String> authorColumn = new TableColumn<Mp3Song, String>(AUTHOR_COLUMN);
		authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));

		TableColumn<Mp3Song, String> albumColumn = new TableColumn<Mp3Song, String>(ALBUM_COLUMN);
		albumColumn.setCellValueFactory(new PropertyValueFactory<>("album"));

		getContentTable().getColumns().add(titleColumn);
		getContentTable().getColumns().add(authorColumn);
		getContentTable().getColumns().add(albumColumn);
	}

	public TableView<Mp3Song> getContentTable() {
		return contentTable;
	}

	public void setContentTable(TableView<Mp3Song> contentTable) {
		this.contentTable = contentTable;
	}

}
