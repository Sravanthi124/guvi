/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class aeiou
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
			count=1;
			}
		}
		if(count==1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		
	}
}
