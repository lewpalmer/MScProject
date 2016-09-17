package Views;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ErrorView extends Application {

	private String errorMessage;
	
	public ErrorView(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
	
	@Override
	public void start(Stage newStage) throws Exception {
		newStage.setTitle("Error!");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text(errorMessage);
        scenetitle.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 15));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Button accept = new Button("OK");
        grid.add(accept, 1,  1);
        accept.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				newStage.close();
			}
        	
        });
        Scene scene = new Scene(grid, 400, 150);
        newStage.setScene(scene);
        newStage.show();
	}

}
