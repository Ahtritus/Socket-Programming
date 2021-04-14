//server class
import java.io.*;
import java.net.*;
class palserver
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(11111);
		System.out.println("Server Waiting...");
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		String inp=dis.readUTF();//read string from socket
		System.out.println("Client sent "+inp);
		pal ob=new pal();
		boolean f=ob.checkpal(inp);
		dos.writeUTF(String.valueOf(f));//write result into socket
		dos.flush();
		dis.close();
		dos.close();
		s.close();
	}
}