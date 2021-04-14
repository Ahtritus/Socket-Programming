//server class
import java.io.*;
import java.net.*;
import java.util.*;

class server
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss=new ServerSocket(12000);
		
		System.out.println("server waiting for client...");
		Socket s=ss.accept(); // wait until client hit
		DataInputStream dis=new DataInputStream(s.getInputStream()); // read from socket
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		while(true)
		{
		String client_msg=String.valueOf(dis.readUTF());
		System.out.println("Client message: "+client_msg);
		System.out.print("Server message: ");
		if(client_msg.equalsIgnoreCase("bye"))
		{
			System.out.print("Bye");
			dos.writeUTF("Bye");
			break;
		}
		Scanner sc=new Scanner(System.in);
		String output=sc.nextLine();
		dos.writeUTF(output);
		dos.flush();
		}
		ss.close();
	}
}