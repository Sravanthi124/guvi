/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sumnumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int N[]=new int[n];
		for(int i=0;i<n;i++)
		{
			N[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+N[i];
		}
		System.out.print(sum);
	}
}
