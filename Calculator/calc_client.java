//client class
import java.io.*;
import java.net.*;
class calc_client
{
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("127.0.0.1",11111);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		System.out.print("Enter expression to calculate with space between each operand and operator:");
		String exp=br.readLine();
		dos.writeUTF(exp);
		dos.flush();
		double output=Double.valueOf(dis.readUTF());
		System.out.println("Result = "+output);
		dos.close();
		dis.close();
		s.close();
	}
}