package Views;
	
import java.io.File;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import Controllers.LoginController;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
        primaryStage.setTitle("Welcome to the Betfair Bot!");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));
        
        LoginController controller = new LoginController();
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        
        userTextField.setOnKeyReleased(new EventHandler <KeyEvent>()
        		{
					@Override
					public void handle(KeyEvent event) {
						controller.SetUsername(userTextField.getText());
					}
        		});
        
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        pwBox.setOnKeyReleased(new EventHandler <KeyEvent>()
		{
			@Override
			public void handle(KeyEvent event) {
				controller.SetPassword(pwBox.getText());
			}
		});
        
        Label certFinder = new Label("PKCS12 Certificate location:");
        grid.add(certFinder, 0, 3);
        
        Button fileChooserButton = new Button("Find Certificate");
        fileChooserButton.setOnAction(new EventHandler<ActionEvent>(){
        		@Override
				public void handle(ActionEvent event) {
        			FileChooser fileChooser = new FileChooser();
					final File selectedFile =
							fileChooser.showOpenDialog(primaryStage);
        			controller.SetCertificateLocation(selectedFile.getAbsolutePath(), fileChooserButton);
				}
        });
        
        grid.add(fileChooserButton, 1, 3);
        
        Label certPassword_lbl = new Label("Certificate Password");
        grid.add(certPassword_lbl, 0, 4);
        
        PasswordField certpwBox = new PasswordField();
        grid.add(certpwBox, 1, 4);
        certpwBox.setOnKeyReleased(new EventHandler <KeyEvent>()
		{
			@Override
			public void handle(KeyEvent event) {
				controller.SetCertificatePassword(certpwBox.getText());
			}
		});
        
        Button logInButton = new Button("Log In");
        logInButton.setVisible(false);
        grid.add(logInButton, 1, 5);
        controller.assignLogInButton(logInButton);
        
        Scene scene = new Scene(grid, 500, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
