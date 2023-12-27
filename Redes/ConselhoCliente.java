package Redes;

import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {
  public static void main(String args[]) throws Exception {
	  
	  Socket socket = new Socket("127.0.0.1", 5000);
	  
	  Scanner s = new Scanner(socket.getInputStream());
	  System.out.println("Mensagem: " + s.nextLine());
	  s.close();
  }
}
