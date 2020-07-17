package pl.javastart.fxzdarzeniazadanie.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class MainPaneController implements Initializable {

	@FXML
	private TextArea txtAreaLeft;

	@FXML
	private TextArea txtAreaRight;

	@FXML
	private Button btnClear;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtAreaLeft.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent e) {
				reverseString(txtAreaLeft.getText(), txtAreaRight);
			}
		});
		txtAreaRight.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent e) {
				reverseString(txtAreaRight.getText(), txtAreaLeft);
			}
		});

	
	}

	private void reverseString(String text, TextArea output) {
		StringBuilder builder = new StringBuilder();
		output.setText(builder.append(text).reverse().toString());
	}

	@FXML
	private void clearAreas() {
		txtAreaLeft.clear();
		txtAreaRight.clear();
	}

}
