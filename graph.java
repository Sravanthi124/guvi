/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class graph
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner cs=new Scanner(System.in);
		int n1=cs.nextInt();
		int n2=cs.nextInt();
		int n3=cs.nextInt();
		int n4=cs.nextInt();
		int n5=cs.nextInt();
		int n6=cs.nextInt();
		int n7=cs.nextInt();
		int n8=cs.nextInt();
		if(n1==n2&&n5==n6&&n3==n8&&n4==n7)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
