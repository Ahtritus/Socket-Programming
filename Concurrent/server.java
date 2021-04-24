import java.io.*;
import java.net.*;
import java.util.*;

class server
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss=new ServerSocket(12345);
		
		System.out.println("server waiting for clients...");
		while(true)
		{
			Socket s=ss.accept(); 
			Thread t=new Thread()
			{
				public void run()
				{	
					try{
					BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
					String client_msg=br.readLine();
					System.out.println(client_msg);
					if(client_msg.substring(9).equalsIgnoreCase("bye"))
					{
						String x=client_msg.substring(0,8)+" has left the chat.";
						PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
						pw.println(x);	
					}
					System.out.println(client_msg);
					PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
					pw.println(client_msg);	
					}catch(Exception e){}
				}
			};
			t.start();
			//s.close();
		}	
		//ss.close();
		
	}
}
	