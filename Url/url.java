//Write a program to get protocol name, host name, port no, file name from a given URL

import java.net.*;
class url
{
	public static void main(String args[]) throws Exception
	{
		URL u=new URL("https://rkmrc.in/pg-departments/computer-science/");
		System.out.println("Protocol :"+u.getProtocol());
		System.out.println("Host name :"+u.getHost());
		System.out.println("Port no :"+u.getPort());
		System.out.println("File name :"+u.getFile());
	}
}