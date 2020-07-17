package pl.javastart.mp3player.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;

public class ControlPaneController implements Initializable{

    @FXML
    private Button prevButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//configureButtons();
		//configureSliders();
	}

	private void configureSliders() {
		getVolumeSlider().valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println("Zmiana g³oœnoœci" + newValue.doubleValue());
			}
		});
	
		getSongSlider().valueProperty().addListener(x -> System.out.println("Przesuniêcie piosenki"));
	
	}
	
	private void configureButtons() {
		getPrevButton().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Poprzedni utwór");
			}
		});
		getNextButton().setOnAction(x -> System.out.println("Nastêpny utwór"));
		getPlayButton().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if (getPlayButton().isSelected()) {
					System.out.println("Play");
				} else {
					System.out.println("Stop");
				}
			}
		});
	}

	public Button getPrevButton() {
		return prevButton;
	}

	public void setPrevButton(Button prevButton) {
		this.prevButton = prevButton;
	}

	public ToggleButton getPlayButton() {
		return playButton;
	}

	public void setPlayButton(ToggleButton playButton) {
		this.playButton = playButton;
	}

	public Button getNextButton() {
		return nextButton;
	}

	public void setNextButton(Button nextButton) {
		this.nextButton = nextButton;
	}

	public Slider getVolumeSlider() {
		return volumeSlider;
	}

	public void setVolumeSlider(Slider volumeSlider) {
		this.volumeSlider = volumeSlider;
	}

	public Slider getSongSlider() {
		return songSlider;
	}

	public void setSongSlider(Slider songSlider) {
		this.songSlider = songSlider;
	}

}

