import java.lang.*;
import java.util.*;
import java.io.*;
public class RightShift
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();

		System.out.println("enter the key value:");
		int k=s.nextInt();
		for(i=0;i<n;i++)
		{
			int x=i+k;
			if(x>=n)
				x=x-n;
			b[x]=a[i];
		}
		for(i=0;i<n;i++)
		System.out.println(b[i]);	                                                                                                                                                                         
			
	}
}