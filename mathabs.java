/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class mathabs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int o=sc.nextInt();
		int p=sc.nextInt();
		System.out.print(Math.abs(m-o)+" "+Math.abs(n-p));
	}
}
