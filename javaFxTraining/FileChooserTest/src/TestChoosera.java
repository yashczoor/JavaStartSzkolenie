import java.io.File;

import javafx.stage.FileChooser;

public class TestChoosera {
	public static void main(String[] args) {

		FileChooser chooser = new FileChooser();
	    chooser.setTitle("Choose location To Save Report");
	    File selectedFile = null;
	    while(selectedFile== null){
	        selectedFile = chooser.showSaveDialog(null);
	    }

	}
}
