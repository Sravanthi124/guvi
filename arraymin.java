/* package whatever; // don't place package name! */
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arraymin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n,min;
		 n=sc.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
		 	a[i]=sc.nextInt();
		 }
		Arrays.sort(a);
		System.out.println(a[0]);
	}
}
