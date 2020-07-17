package pl.javastart.zadanie.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class buttonPaneController implements Initializable {

	@FXML
	private Label label1;

	@FXML
	private Button button1;

	@FXML
	private Label label2;

	@FXML
	private Button button2;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		label1.setText("Etykieta 1");
		button1.setText("Przycisk 1");
		label2.setText("Etykieta 2");
		button2.setText("Przycisk numer 2");
	}
}
