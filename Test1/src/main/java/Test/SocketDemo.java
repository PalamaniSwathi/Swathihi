package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class SocketDemo {
	public static void main(String[] args) {
new Server();
	}
}
class Server{
	ServerSocket server;
	Socket client;
	public Server() {
		try {
			
		server=new ServerSocket(6000);
		while(true) {
		System.out.println("server ready to accept....");
		client=server.accept();
		System.out.println(client);
		PrintStream out=new PrintStream(client.getOutputStream(),true);
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter a message to client...");
		String msgtoclient=in.readLine();
		out.println(msgtoclient);
		
		BufferedReader bis=new BufferedReader(new InputStreamReader(client.getInputStream()));
		String msgfrmclient=bis.readLine();
		System.out.println("message from client" +msgfrmclient);
			}
	}catch (Exception e) {
e.printStackTrace();
}
	}
	public static void main(String[] args) {
		new Server();
	}
}
class Client{
	Socket client;
	 public Client() {
		try {
			while(true) {
		client=new Socket("localhost",6000);
		BufferedReader bis=new BufferedReader(new InputStreamReader(client.getInputStream()));
		String msgfrmserver=bis.readLine();
		System.out.println("message from server" +msgfrmserver);
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter a message to server...");
		String msgtoserver=in.readLine();
		
		PrintStream out=new PrintStream(client.getOutputStream(),true);
		out.println(msgtoserver);
			}
	}catch (Exception e) {
e.printStackTrace();
}
	}
	 public static void main(String[] args) {
		new Client();
	}
}









