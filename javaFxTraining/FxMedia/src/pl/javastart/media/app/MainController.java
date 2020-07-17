package pl.javastart.media.app;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController implements Initializable {
	
	@FXML
    private MediaView mediaView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Media media = new Media("https://www.mediacollege.com/video-gallery/testclips/barsandtone.flv");
		MediaPlayer player = new MediaPlayer(media);
		player.setAutoPlay(true);
		mediaView.setMediaPlayer(player);
	}

}