import java.lang.*;
import java.util.*;
import java.io.*;
public class RevString
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		String st=s.next();
		StringBuffer stb=new StringBuffer(st);
		stb.reverse();
		for(int i=0;i<stb.length();i++)
		{
			char ch=stb.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				stb.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(stb);
	}
}