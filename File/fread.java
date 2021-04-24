//file read class
import java.io.*;
class fread
{
	public static String readfile(String s) throws Exception
	{
		String w="";
		try{
			FileInputStream fin = new FileInputStream (s);
			int i;
			while((i=fin.read())!=-1)
				w= w + ((char)i);
		}
		catch(Exception e)
		{
			w="File not found";
		}
		return w;
	}
}
	
		