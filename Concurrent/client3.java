//code for first client
import java.net.*;
import java.io.*;
import java.util.*;
class client1
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",12345);
		while(true)
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("You are typing...");
			String msg_sent = br.readLine();			
			msg_sent = "Client 3: "+msg_sent;
			
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println(msg_sent);
			
			if(msg_sent.equalsIgnoreCase("Client 3: bye"))
				break;
			
			BufferedReader br2=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg_received = br2.readLine();
			System.out.println(msg_received);
		}
		s.close();
	}
}	
		
			