package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


//die handler vom scene builder m�ssen hier implementiert werden
public class SampleController {
	
	//mit @FXML wird quasi ein neues Label erstellt (analog mit new Label...)
	@FXML Label statusLabel;

	@FXML public void drueckeButton() {
		System.out.println("button gedr�ckt...");
		statusLabel.setText("Button gedr�ckt...");
	}

	@FXML public void betreteButton() {
		System.out.println("maus betritt button");
		statusLabel.setText("maus betritt button");
	}

	@FXML public void verlasseButton() {
		System.out.println("maus verl�sst button");
		statusLabel.setText("maus verl�sst button");
	}
	
}
