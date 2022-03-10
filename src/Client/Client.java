package Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Client {
	
	public Client() {
		
	}
	
	public void sendMessage() {
		
		
	}
	
	public void listenForMessage(){
		
	}

	public void closeEverything() {
		
	}
	
	 
	
	public static void main(String[] args) throws UnknownHostException, IOException, NoSuchPaddingException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you username for the group chat: ");
		String username = scanner.nextLine();
		
		
		
		
		
		
	}

}
