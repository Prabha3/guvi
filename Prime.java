import java.lang.*;
import java.io.*;
import java.util.*;
public class Prime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int st=s.nextInt();
		int ed=s.nextInt();
		int i=0;j=0;
		int f;
		for(i=st;i<=ed;i++)
		{
			f=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					f=1;
			}
			if(f==0)
				System.out.println(i);
		}
	}
}