import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to be checked:");
		int a=sc.nextInt();
		if (a>0){
			System.out.println("the entered number "+a+" is positive");
			
		}
		else if(a<0){
			System.out.println("the entered number "+a+" is negative");
		}
		else{
			System.out.println("the entered number "+a+" is zero");
		}
			
		}
	}
}