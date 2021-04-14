//udp server
import java.io.*;
import java.util.*;
import java.net.*;
class udpserver
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket(23456);
		byte receive[]=new byte[65535];
		DatagramPacket dpreceive = null;
		while(true)
		{
			dpreceive = new DatagramPacket(receive,receive.length);
			ds.receive(dpreceive);
			System.out.println(build(receive));
			if(String.valueOf(build(receive)).equalsIgnoreCase("bye"))
				break;
			receive=new byte[65535];//to clear the buffer
		}
	}
	
	static StringBuilder build(byte a[])
	{
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(a[i]!=0)
		{
			sb.append((char)a[i]);
			i++;
		}
		return sb;
	}
			
}
