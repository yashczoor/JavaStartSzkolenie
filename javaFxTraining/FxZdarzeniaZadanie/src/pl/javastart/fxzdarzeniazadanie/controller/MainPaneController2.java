package pl.javastart.fxzdarzeniazadanie.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class MainPaneController2 implements Initializable {

	@FXML
	private TextArea txtAreaLeft;

	@FXML
	private TextArea txtAreaRight;

	@FXML
	private Button btnClear;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtAreaLeft.addEventFilter(KeyEvent.KEY_RELEASED,
				x -> txtAreaRight.setText(new StringBuilder(txtAreaLeft.getText()).reverse().toString()));
		txtAreaRight.addEventFilter(KeyEvent.KEY_RELEASED, x->txtAreaLeft.setText(new StringBuilder(txtAreaRight.getText()).reverse().toString()));
	}

	@FXML
	private void clearAreas() {
		txtAreaLeft.clear();
		txtAreaRight.clear();
	}

}
