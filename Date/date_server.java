// Date Server class

import java.net.*;
import java.io.*;
import java.util.*;

class date_server
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(11111);

		System.out.println("Waiting For Client...");
        Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		System.out.println("Client IP1: "+ dis.readUTF());
		System.out.println("Client IP2: "+ dis.readUTF());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeBytes("Server Date:" + (new Date()).toString());
        dis.close();
		dos.close();
        ss.close();
		s.close();
        
        
    }
}