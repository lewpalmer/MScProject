package Betfair.API.Handler.Main;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

public class CreateSSLSocket {
	private String certificateLocation;
	private String certificatePassword;
	
	public CreateSSLSocket(String location, String password)
	{
		this.certificateLocation = location;
		this.certificatePassword = password;
		FileInputStream keyStream = null;
		try{
		KeyStore clientStore = KeyStore.getInstance("PKCS12");
        keyStream = new FileInputStream(this.certificateLocation);
        clientStore.load(keyStream, this.certificatePassword.toCharArray());

        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        kmf.init(clientStore, this.certificatePassword.toCharArray());
        KeyManager[] kms = kmf.getKeyManagers();

        SSLContext sslContext = null;
        sslContext = SSLContext.getInstance("TLS");
        sslContext.init(kms, null, new SecureRandom());

        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
		}
		catch(IOException ex)
		{
			
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CertificateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnrecoverableKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try{
				keyStream.close();
			}
			catch(Exception ex){}
		}
	}
	

}
