package pl.javastart.fxaction.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable {

	@FXML
	private TextArea mainTextArea;

	@FXML
	private Button lowerCaseButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TAK Z KLAS¥ ANONIMOW¥
		/*
		 * lowerCaseButton.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent event) {
		 * System.out.println("Wygenerowano zdarzenie " + event.getEventType()); String
		 * text = mainTextArea.getText(); mainTextArea.setText(text.toLowerCase()); }
		 * });
		 */
		// A TAK LAMBD¥
		// lowerCaseButton.setOnAction(x ->
		// mainTextArea.setText(mainTextArea.getText().toLowerCase()));
		// A TAK Z EVENT HANDLEREM
		/*lowerCaseButton.addEventFilter(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Zdarzenie " + event.getEventType());
				String text = mainTextArea.getText();
				mainTextArea.setText(text.toLowerCase());
			}
		});
		lowerCaseButton.addEventFilter(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				System.out.println("Uwaga, bedzie klika³!");
			}
			
		});*/
	}
	
	@FXML
	private void toLowerCaseAction(ActionEvent event) {
		System.out.println("Zdarzenie " + event.getEventType());
		String text = mainTextArea.getText();
		mainTextArea.setText(text.toLowerCase());
	}
	
}