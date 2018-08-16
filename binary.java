/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class binary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i;
		int count=0;
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		for(i=0;i<c.length();i++)
		{
			if(c.charAt(i)=='0'||c.charAt(i)=='1')
			{
				count++;
			}
		}
		if(count==c.length())
		{
		System.out.print("Yes");
		}
		else
		{
				System.out.print("No");
			
		}
		
	}
}
