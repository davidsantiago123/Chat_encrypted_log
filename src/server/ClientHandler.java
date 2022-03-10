package server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable {

	public static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
	private Socket socket;

	public ClientHandler(Socket socket) throws IOException {
		
			this.socket = socket;
			
			clientHandlers.add(this);
		
	}

	@Override
	public void run() {

		while (socket.isConnected()) {
			
		}

	}

	

	public void removeClientHandler() {
		clientHandlers.remove(this);
		
	}

	

}
