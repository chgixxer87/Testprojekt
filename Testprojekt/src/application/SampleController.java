package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


//die handler vom scene builder müssen hier implementiert werden
public class SampleController {
	
	//mit @FXML wird quasi ein neues Label erstellt (analog mit new Label...)
	@FXML Label statusLabel;

	@FXML public void drueckeButton() {
		System.out.println("button gedrückt...");
		statusLabel.setText("Button gedrückt...");
	}

	@FXML public void betreteButton() {
		System.out.println("maus betritt button");
		statusLabel.setText("maus betritt button");
	}

	@FXML public void verlasseButton() {
		System.out.println("maus verlässt button");
		statusLabel.setText("maus verlässt button");
	}
	
}
