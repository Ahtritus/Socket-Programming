//server class
import java.io.*;
import java.net.*;
class calc_server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(11111);
		System.out.println("Server Waiting...");
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		String inp=dis.readUTF();//read string from socket
		System.out.println("Client sent expression : "+inp);
		calc ob=new calc();
		double res = ob.calculate(inp);
		System.out.println("Result = "+res);
		dos.writeUTF(String.valueOf(res));//write result into socket
		dos.flush();
		dis.close();
		dos.close();
		s.close();
	}
}		