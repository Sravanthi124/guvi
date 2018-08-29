

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class intrevs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,sum=0,res;
		  while(n>0)
		  {    
			 res=n%10;  //getting remainder  
			 sum=(sum*10)+res;   
			 n=n/10;
		  }
		  System.out.print(sum);
	}
}
