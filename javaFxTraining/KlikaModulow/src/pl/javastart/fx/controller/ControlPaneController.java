package pl.javastart.fx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControlPaneController implements Initializable {

    @FXML
    private Button upperCaseButton;

    @FXML
    private Button lowerCaseButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Stworzono ControlPaneController");
	}

	public Button getUpperCaseButton() {
		return upperCaseButton;
	}

	public void setUpperCaseButton(Button upperCaseButton) {
		this.upperCaseButton = upperCaseButton;
	}

	public Button getLowerCaseButton() {
		return lowerCaseButton;
	}

	public void setLowerCaseButton(Button lowerCaseButton) {
		this.lowerCaseButton = lowerCaseButton;
	}

}
