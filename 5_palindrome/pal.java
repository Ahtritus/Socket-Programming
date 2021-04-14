//Write a program to check whether a string is palindrome or not using socket programming
class pal
{
	boolean checkpal(String s)
	{
		String rev="";
        // To reverse the string
        for(int i=0; i<s.length(); i++)
		{
			rev=s.charAt(i)+rev;
		}
	if(rev.equalsIgnoreCase(s))
		return true;
	else
		return false;
	}
}
		