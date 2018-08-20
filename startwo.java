/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class startwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		int n=c.length();
		String str;
		if(n%2==0)
		{
			str=c.substring(0,n/2-1)+"**"+c.substring(n/2+1,n);
		}
		else
		{
			str=c.substring(0,n/2)+"*"+c.substring(n/2+1,n);	
		}
		System.out.println(str);
	}
}
