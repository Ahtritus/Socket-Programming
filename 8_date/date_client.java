// Date Client class

import java.io.*;
import java.net.*;

class date_client
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",11111);  
			
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		InetAddress ip = InetAddress.getLocalHost();
		dos.writeUTF(String.valueOf(ip));
		
		dos.writeUTF(ip.getHostAddress());
		
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(br.readLine());
		
		dos.close();
		s.close();
    }    
}
