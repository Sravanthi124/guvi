/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class specount
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count=0,i;
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		String re="";
		for(i=0;i<=c.length()-1;i++)
		{
			if(!Character.isDigit(c.charAt(i))&&!Character.isAlphabetic(c.charAt(i))&&c.charAt(i)!='.')
			{
			count++;
			}
		}
		System.out.println(count);
	}
}
