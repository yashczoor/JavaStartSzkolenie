package pl.javastart.mp3player.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.util.Duration;
import pl.javastart.mp3player.mp3.Mp3Parser;
import pl.javastart.mp3player.mp3.Mp3Player;
import pl.javastart.mp3player.mp3.Mp3Song;

public class MainController implements Initializable {

	@FXML
	private ContentPaneController contentPaneController;

	@FXML
	private ControlPaneController controlPaneController;

	@FXML
	private MenuPaneController menuPaneController;

	private Mp3Player mp3Player;
	private Mp3Parser mp3Parser;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mp3Player = new Mp3Player();
		configControlPaneAction();
		configureVolume();
		configureTable();
		//testMp3Add();
		configureMenu();
	}

	private void configureMenu() {
		MenuItem openFile = menuPaneController.getFileMenuItem();
		MenuItem openDir = menuPaneController.getDirMenuItem();

		openFile.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				FileChooser fc = new FileChooser();

				fc.getExtensionFilters().add(new ExtensionFilter("Mp3", "*.mp3"));
				File file = fc.showOpenDialog(new Stage());
				System.out.println(file);
				mp3Player.getMp3Collection().clear();
				//Mp3Song mp3 = mp3Parser.createMp3Song(file);
				Mp3Song mp3 = createMp3Song(file);
				mp3Player.getMp3Collection().addSong(mp3);
				// mp3Player.getMp3Collection().addSong(mp3Parser.createMp3Song(file));
			}
		});

		openDir.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DirectoryChooser dc = new DirectoryChooser();
				File dir = dc.showDialog(new Stage());
				mp3Player.getMp3Collection().clear();
				mp3Player.getMp3Collection().addSongs(createMp3Songs(dir));
				//mp3Player.getMp3Collection().addSongs(createMp3Songs(dir));
			}
		});
	}

	private void testMp3Add() {
		mp3Player.getMp3Collection().addSong(createMp3SongFromPath("Bubliczki - Nie ma si�y.mp3"));
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
		} catch (IOException | TagException e) {
			e.printStackTrace();
		}
		return result;
	}

	private void configureTable() {
		TableView<Mp3Song> contentTable = contentPaneController.getContentTable();
		contentTable.setItems(mp3Player.getMp3Collection().getSongList());
		contentTable.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount() == 2) {
					mp3Player.loadSong(contentTable.getSelectionModel().getSelectedIndex());
					configureProgressBar();
					controlPaneController.getPlayButton().setSelected(true);
				}
			}
		});
	}

	private void configureProgressBar() {
		Slider songSlider = controlPaneController.getSongSlider();
		mp3Player.getMediaPlayer().setOnReady(new Runnable() {

			@Override
			public void run() {
				songSlider.setMax(mp3Player.getLoadedSongLength());
			}
		});
		mp3Player.getMediaPlayer().currentTimeProperty().addListener(new ChangeListener<Duration>() {
			@Override
			public void changed(ObservableValue<? extends Duration> arg0, Duration arg1, Duration arg2) {
				songSlider.setValue(arg2.toSeconds());
			}

		});
		songSlider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				if (songSlider.isValueChanging()) {
					mp3Player.getMediaPlayer().seek(Duration.seconds(arg2.doubleValue()));
				}
			}
		});
	}

	private void configureVolume() {
		Slider volSlider = controlPaneController.getVolumeSlider();
		final double minVolume = 0;
		final double maxVolume = 1;
		volSlider.setMin(minVolume);
		volSlider.setMax(maxVolume);
		volSlider.setValue(maxVolume);
		volSlider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mp3Player.setVolume(newValue.doubleValue());
			}
		});
	}

	private void configControlPaneAction() {
		TableView<Mp3Song> contentTable = contentPaneController.getContentTable();
		ToggleButton playButton = controlPaneController.getPlayButton();
		Button prevButton = controlPaneController.getPrevButton();
		Button nextButton = controlPaneController.getNextButton();

		playButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (playButton.isSelected()) {
					mp3Player.play();
				} else {
					mp3Player.stop();
				}
			}
		});

		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				contentTable.getSelectionModel().select(contentTable.getSelectionModel().getSelectedIndex() + 1);
				mp3Player.loadSong(contentTable.getSelectionModel().getSelectedIndex());
			}
		});

		prevButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				contentTable.getSelectionModel().select(contentTable.getSelectionModel().getSelectedIndex() - 1);
				mp3Player.loadSong(contentTable.getSelectionModel().getSelectedIndex());
			}
		});
	}

	///////////////////////////////////////////
	public Mp3Song createMp3Song(File file) {
		Mp3Song result = new Mp3Song();
		MP3File mp3File = null;
		
		try {
			mp3File = new MP3File(file);
		} catch (IOException | TagException e) {
			e.printStackTrace();
		}
		
		result.setFilePath(file.getAbsolutePath());
		
		try {
			result.setTitle(mp3File.getID3v2Tag().getSongTitle());
			result.setAuthor(mp3File.getID3v2Tag().getLeadArtist());
			result.setAlbum(mp3File.getID3v2Tag().getAlbumTitle());
		} catch (NullPointerException e) {
			result.setTitle("tytu�");
			result.setAuthor("autor");
			result.setAlbum("album");
			System.err.println("nie uda�o si� pobra� danych z pliku Mp3");
		}
		
		return result;
	}
	
	public ObservableList<Mp3Song> createMp3Songs(File dir) {
		if(!dir.isDirectory()) {
			return null;
		}
		
		ObservableList<Mp3Song> result = FXCollections.observableArrayList();
		File[] files = dir.listFiles();
		for(File f: files) {
			String fileExtension = f.getName().substring(f.getName().lastIndexOf(".") + 1);
			if(fileExtension.equals("mp3"))
				result.add(createMp3Song(f));
		}
		
		return result;
	}
	///////////////////////////////////////////////////////////////////////
	
	
}