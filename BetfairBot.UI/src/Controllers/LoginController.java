package Controllers;

import Betfair.API.Calls.loginCall;
import Betfair.API.Handler.Main.BetfairAPICredentials;
import Betfair.API.Requests.LoginRequest;
import Views.ErrorView;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoginController {
	private BetfairAPICredentials userCredentials = new BetfairAPICredentials();
	private boolean formCompleted;
	private Button loginButton;
	
	public void assignLogInButton(Button logInButton)
	{
		this.loginButton = logInButton;
	}
	
	public void SetUsername(String username)
	{
		this.userCredentials.SetUsername(username);
		CheckAllCompleted();
	}
	
	public void SetPassword(String password)
	{
		this.userCredentials.SetPassword(password);
		CheckAllCompleted();
	}
	
	public void SetCertificateLocation(String filePath, Button fileFinderButton)
	{
		if(filePath.contains(".pkcs12"))
		{
			this.userCredentials.SetCertificateLocation(filePath);
			fileFinderButton.setText("Success");
			CheckAllCompleted();
		}
		else
		{
			ErrorView fileError = new ErrorView("Incorrect file added. Please create a PKCS12 certificate file");
			try {
				fileError.start(new Stage());
			} catch (Exception e) {
				//To do - deal with this...
			}
		}
			
	}
	
	public void SetCertificatePassword(String password)
	{
		this.userCredentials.SetCertificatePasscode(password);
		CheckAllCompleted();
	}
	
	private void CheckAllCompleted()
	{
		formCompleted = this.userCredentials.GetUsername() != null && this.userCredentials.GetUsername() != ""
				&& this.userCredentials.GetPassword() != null && this.userCredentials.GetPassword() != ""
				&& this.userCredentials.GetCertificateLocation() != null && this.userCredentials.GetCertificateLocation() != ""
				&& this.userCredentials.GetCertificatePasscode() != null && this.userCredentials.GetCertificatePasscode() != "";
		this.loginButton.setVisible(formCompleted);
	}
	
	public boolean IsFormCompleted()
	{
		return this.formCompleted;
	}
	
	public void LogIn() throws Exception
	{
		loginCall logIn = new loginCall(this.userCredentials, new LoginRequest(this.userCredentials.GetUsername(), this.userCredentials.GetPassword()));
		if(logIn.call())
		{
			//to-do
		}
		else
		{
			ErrorView loginError = new ErrorView("Could not log-in");
			loginError.start(new Stage());
		}
		
	}
	
}
