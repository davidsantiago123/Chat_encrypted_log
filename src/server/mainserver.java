package server;

import java.net.Socket;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;

public class mainserver {

	private ServerSocket serverSocket;

	public mainserver(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}

	public void startServer() {

		try {
			while (!serverSocket.isClosed()) {
				Socket socket = serverSocket.accept();
				System.out.println("A new client has connected!");
				ClientHandler clientHandler = new ClientHandler(socket);

				Thread thread = new Thread(clientHandler);
				thread.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void closeServerSocket() {
		try {
			if (serverSocket != null) {
				serverSocket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		File file = new File("C:\\Users\\cherecho\\eclipse-workspace\\chat-encrypted-log\\src\\server\\log.txt");

		if (!file.exists()) {
			file.createNewFile();
		}
		*/
		ServerSocket serverScocket = new ServerSocket(3000);
		mainserver server = new mainserver(serverScocket);
		server.startServer();

	}

}
