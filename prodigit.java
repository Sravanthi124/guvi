/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prodigit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int res=1,rem=0;
		int a=sc.nextInt();
		while(a!=0)
		{
			rem=a%10;
			res=res*rem;
			a=a/10;
		}
		System.out.println(res);

	}
}
