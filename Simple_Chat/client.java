//client class
import java.io.*;
import java.net.*;
import java.util.*;
class client
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",12000);
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.print("Client message: ");
		dos.writeUTF(sc.nextLine());
		dos.flush();
		String output=dis.readUTF();
		System.out.println("Server message: "+output);
		if(output.equalsIgnoreCase("bye"))
			break;
		}
		s.close();
	}
}