package blah;

import javafx.application.*;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class Math extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane gridpane = new GridPane();
		Scene scene = new Scene(gridpane, 600, 400);
		
		TextField firstValue = new TextField();
		firstValue.setText("Enter an integer here: ");
		gridpane.add(firstValue, 0, 2);
		
		TextField secondValue = new TextField();
		secondValue.setText("Enter an integer here: ");
		gridpane.add(secondValue, 1, 2);
		
		TextField result = new TextField();
		gridpane.add(result, 0, 3);
		
		Button button1 = new Button("Multiply");
		gridpane.add(button1, 2, 2);
		
		button1.setOnAction(e-> {
			int v1 = Integer.valueOf(firstValue.getText());
			int v2 = Integer.valueOf(secondValue.getText());
			int r = v1 * v2;
			result.setText("Product is: " + r);
		});
		
		
		
		primaryStage.setTitle("Math");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public static void main(String args[]) {
		launch(args);
	}
}


