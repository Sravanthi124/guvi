/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class numbercoun
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			n=n/10;
			count++;
		}
		System.out.print(count);
	}
}
