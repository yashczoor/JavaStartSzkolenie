package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class TextPaneController implements Initializable{

    @FXML
    private TextArea textArea;

    @FXML
    private Button button;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		button.setOnAction(x -> textArea.clear());
	
	}

}
