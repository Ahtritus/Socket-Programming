//client class
import java.io.*;
import java.net.*;
class freadclient
{
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("127.0.0.1",11111);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		System.out.println("Enter file name to read:");
		String str=br.readLine();
		dos.writeUTF(str);
		dos.flush();
		String output=dis.readUTF();
		System.out.println(output);
		dos.close();
		dis.close();
		s.close();
	}
}