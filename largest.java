import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.print(n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2);
		}
		else
		{
			System.out.print(n3);
		}
	}
}
