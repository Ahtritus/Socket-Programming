//client class
import java.io.*;
import java.net.*;
class palclient
{
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("127.0.0.1",11111);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		System.out.println("Enter string to check:");
		String str=br.readLine();
		dos.writeUTF(str);
		dos.flush();
		String output=dis.readUTF();
		if(output.equals("true"))
			System.out.println("Palindrome string.");
		else
			System.out.println("Palindrome string.");
		dos.close();
		dis.close();
		s.close();
	}
}