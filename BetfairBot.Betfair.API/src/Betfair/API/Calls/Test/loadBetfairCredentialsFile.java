package Betfair.API.Calls.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Betfair.API.Handler.Main.BetfairAPICredentials;

public class loadBetfairCredentialsFile {

	public static BetfairAPICredentials loadUserCredentials()
	{
		String credentialsFile = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader ("/Users/lewispalmer/betfairCredentials.txt"));
			StringBuilder  stringBuilder = new StringBuilder();
			String line = null;
			while((line = reader.readLine()) != null)
	            stringBuilder.append(line);
			credentialsFile = stringBuilder.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] splitCredentials = credentialsFile.split(",");
		BetfairAPICredentials testBFCreds = new BetfairAPICredentials();
		testBFCreds.SetUsername(splitCredentials[0]);
		testBFCreds.SetPassword(splitCredentials[1]);
		testBFCreds.SetApplicationKey(splitCredentials[2]);
		testBFCreds.SetCertificateLocation(splitCredentials[3]);
		testBFCreds.SetCertificatePasscode(splitCredentials[4]);
		return testBFCreds;
	}
}
