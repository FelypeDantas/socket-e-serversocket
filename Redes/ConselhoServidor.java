package Redes;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {
  public static void main(String []args) throws Exception {
	  
	  ServerSocket server = new ServerSocket(5000);
	  while(true) {
		 Socket socket = server.accept();
		 try(PrintWriter w =  new PrintWriter(socket.getOutputStream())){
			 w.println("Aprenda Java");
		 }
	
	  }
  }
}
