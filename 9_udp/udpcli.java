//UDP Communications for client
import java.io.*;
import java.util.*;
import java.net.*;
class udpcli
{
	public static void main(String args[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		//creating a socket object to carry the data
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalHost();
		byte buff[]=null;
		while(true)
		{
			String inp=sc.nextLine();
			//convert the string into byte array
			buff=inp.getBytes();
			//datagram packet for sending data
			DatagramPacket dp=new DatagramPacket(buff,buff.length,ip,23456);
			ds.send(dp);//sending data
			if(inp.equals("bye"))
				break;
		}
	}
}
