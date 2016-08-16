import java.lang.*;
import java.util.*;
import java.io.*;
public class StrInt
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer value:");
	
		StringBuffer stb=new StringBuffer(s.next());
		stb.reverse();
String str=new String(stb);
		int n=Integer.parseInt(str);
		System.out.println(n);
	}
}

	