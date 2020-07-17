package pl.javastart.youtufy.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import pl.javastart.youtufy.data.YoutubeVideo;

public class ContentPaneController implements Initializable {

	@FXML
	private TableView<YoutubeVideo> resultTableView;

	@FXML
	private WebView videoWebView;

	public TableView<YoutubeVideo> getResultTableView() {
		return resultTableView;
	}

	public void serResultTableView(TableView<YoutubeVideo> resultTableView) {
		this.resultTableView = resultTableView;
	}

	public WebView getVideoWebView() {
		return videoWebView;
	}

	public void setVideoWebView(WebView videoWebView) {
		this.videoWebView = videoWebView;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TableColumn<YoutubeVideo, String> titleColumn = new TableColumn<>("Song");
		titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

		TableColumn<YoutubeVideo, String> authorColumn = new TableColumn<>("Youtube Author");
		authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));

		configureWebView();

		resultTableView.getColumns().add(titleColumn);
		resultTableView.getColumns().add(authorColumn);

	}

	private void configureWebView() {
		WebEngine webEngine = videoWebView.getEngine();
		webEngine.setJavaScriptEnabled(true);
		webEngine.load(getClass().getResource("/pl/javastart/youtufy/res/video.html").toExternalForm());
	}

	protected void playSelectedItem() {
		WebEngine webEngine = videoWebView.getEngine();
		webEngine.executeScript("player.stopVideo();");
		YoutubeVideo selectedVideo = resultTableView.getSelectionModel().getSelectedItem();
		webEngine.executeScript("player.loadVideoById(\"" + selectedVideo.getId() + "\");");
	}

}
