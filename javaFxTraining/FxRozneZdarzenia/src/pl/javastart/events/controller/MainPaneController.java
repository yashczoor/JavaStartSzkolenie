package pl.javastart.events.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;

public class MainPaneController implements Initializable{

    @FXML
    private MenuBar menuBar;

    @FXML
    private TextArea txtArea1;

    @FXML
    private TextArea txtArea2;

    @FXML
    private Button button;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
