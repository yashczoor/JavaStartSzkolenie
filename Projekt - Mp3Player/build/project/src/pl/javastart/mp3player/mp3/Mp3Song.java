package pl.javastart.mp3player.mp3;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Mp3Song {
	private StringProperty title;
	private StringProperty author;
	private StringProperty album;
	private String filePath;
	
	public String getTitle() {
		return title.get();
	}
	public void setTitle(String title) {
		this.title.setValue(title);
	}
	
	public StringProperty titleProperty() {
		return title;
	}
	public StringProperty authorProperty() {
		return author;
	}
	public void setAuthor(String author) {
		this.author.setValue(author);
	}
	public String getAuthor() {
		return author.get();
	
	}
	public String getAlbum() {
		return album.get();
	}
	public void setAlbum(String album) {
		this.album.setValue(album);
	}
	
	public StringProperty albumProperty() {
		return album;
	}
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public Mp3Song() {
		this.title = new SimpleStringProperty();
		this.author = new SimpleStringProperty();
		this.album = new SimpleStringProperty();
	}
	
	@Override
	public String toString() {
		return "Mp3Song [title=" + title + ", author=" + author + ", album=" + album + ", filePath=" + filePath + "]";
	}
	
}
