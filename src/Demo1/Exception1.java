package Demo1;

import java.util.Scanner;

public class Exception1 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Exception Demo");
		// Example 1 
		// if you uncomment below three lines and try to run you will get java.lang.NullPointerException
		// You are trying to find out length of null. 
		//String name = null;
		//System.out.println("Lets try to display null " + name);
		//System.out.println("Lets try to display length of null " + name.length());
		
		
		// Example 2
		// if you give data = string i.e abcd or anything in string it will give error java.lang.NumberFormatException
		// Uncomment below three lines to see the exception
		//String data = "abcd";
		//int sal = Integer.parseInt(data);
		//System.out.println("Lets see the value of int " + sal);
		
		// Example 3 : if i try to access charAt(10) it will give error
		// java.lang.StringIndexOutOfBoundsException
		//Uncomment below 2 lines to see the exception
		//String s1 = "Narendar";
		//System.out.println("Lets try to access char at indes " + s1.charAt(10));
		
		// Example 4
		// if you enter second number as 0 it will give arithematic exception.
		//java.lang.ArithmeticException
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		a=s.nextInt();
		System.out.println("Enter second number");
		b=s.nextInt();
		c=a/b;
		System.out.println("division of first/second is   " + c);
		
		
		// if you try to access array of d[5] which is out of range it will give exception
		//java.lang.ArrayIndexOutOfBoundsException
		int d[] = new int[5];
		System.out.println(" lets try to accesss array element " + d[4]);
		
		
		
	}


	

}
