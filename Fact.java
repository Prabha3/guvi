import java.lang.*;
import java.io.*;
import java.util.*;
public class Fact
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,fact=1;
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}