//to find the host name and address by a given domain name
import java.net.*;
class domain
{
	public static void main(String args[])
	{
		try{
			InetAddress ip = InetAddress.getByName("www.sbdas.net.in");
			System.out.println("Host name: "+ ip.getHostName());
			System.out.println("IP address: "+ ip.getHostAddress());
			
			}
		catch(Exception e)
		{System.out.println(e);}
	}
}
