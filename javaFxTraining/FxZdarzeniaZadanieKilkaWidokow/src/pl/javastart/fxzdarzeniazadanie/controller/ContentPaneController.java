package pl.javastart.fxzdarzeniazadanie.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class ContentPaneController implements Initializable{

    @FXML
    private TextArea txtAreaLeft;

    @FXML
    private TextArea txtAreaRight;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Stworzono ContentPane");
	}

	public TextArea getTxtAreaLeft() {
		return txtAreaLeft;
	}

	public void setTxtAreaLeft(TextArea txtAreaLeft) {
		this.txtAreaLeft = txtAreaLeft;
	}

	public TextArea getTxtAreaRight() {
		return txtAreaRight;
	}

	public void setTxtAreaRight(TextArea txtAreaRight) {
		this.txtAreaRight = txtAreaRight;
	}

}
