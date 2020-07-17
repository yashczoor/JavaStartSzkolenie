package pl.javastart.events.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = (Parent)FXMLLoader.load(getClass().getResource("/pl/javastart/events/view/MainPane.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Guziki");
		stage.show();
		//scene.addEventFilter(MouseEvent.ANY, x->System.out.println("Dowolne zdarzenie myszy"));
		scene.addEventFilter(MouseEvent.MOUSE_CLICKED, x->System.out.println("Lewy klik"));
		scene.addEventFilter(MouseEvent.MOUSE_DRAGGED, x->System.out.println("Przeci¹gniêto"));
		scene.addEventFilter(MouseEvent.MOUSE_ENTERED, x->System.out.println("Mysz wjecha³a"));
		scene.addEventFilter(MouseEvent.MOUSE_EXITED, x->System.out.println("Mysz wyjecha³a"));
		//scene.addEventFilter(MouseEvent.MOUSE_MOVED, x->System.out.println("Mysz poruszona"));
		scene.addEventFilter(MouseEvent.MOUSE_PRESSED, x->System.out.println("Wciœniêto przycisk"));
		scene.addEventFilter(MouseEvent.MOUSE_RELEASED, x->System.out.println("Zwolniono przycisk"));
		//ZDARZENIA KLAWIATURY
		scene.addEventFilter(KeyEvent.ANY, x->System.out.println("Dowolna akcja klawiatury"));
		scene.addEventFilter(KeyEvent.KEY_PRESSED, x->System.out.println("Wciœniêto klawisz"));
		scene.addEventFilter(KeyEvent.KEY_RELEASED,x->System.out.println("Zwolniono klawisz"));
		scene.addEventFilter(KeyEvent.KEY_TYPED, x->System.out.println("Wciœniêto i puszczono klawisz"));
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
