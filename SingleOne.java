import java.lang.*;
import java.util.*;
import java.io.*;
public class SingleOne
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int[] a=new int[n];
		for(i=0;i<n;i++)	
			a[i]=s.nextInt();
		Arrays.sort(a);
		for(i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1];
				i++;
			else
			{	
				System.out.println(a[i]);
				System.exit(0);		
			}
		}
	}
}