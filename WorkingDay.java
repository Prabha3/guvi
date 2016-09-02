import java.lang.*;
import java.io.*;
import java.util.*;
public class WorkingDay
{
public static void main(String agrs[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the working day:")
String st=s.next();
if(st.equalsIgnoreCase("sunday"))
	System.out.println("false");
else
	System.out.println("true");
}
}