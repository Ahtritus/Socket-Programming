//server class
import java.io.*;
import java.net.*;
class freadserver
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(11111);
		System.out.println("Server Waiting...");
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		String inp=dis.readUTF();
		System.out.println("Client sent "+inp);
		String output=fread.readfile(inp);
		dos.writeUTF(output);
		dos.flush();
		dis.close();
		dos.close();
		s.close();
	}
}
		