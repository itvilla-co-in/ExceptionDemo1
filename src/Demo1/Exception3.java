package Demo1;

import java.util.Scanner;

public class Exception3 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Exception Demo");
		int a,b,c;
		try
		{
		String name = null;
		System.out.println("Lets try to display null " + name);
		System.out.println("Lets try to display length of null " + name.length());
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		a=s.nextInt();
		System.out.println("Enter second number");
		b=s.nextInt();
		c=a/b;
		System.out.println("division of first/second is   " + c);

		
		}catch (NullPointerException e)
		{
			System.out.println(" You cannot use length function with string "+ e);
		}
		catch (ArithmeticException e)
		{
			System.out.println(" You cannot divide by 0 "+ e);
		}

		finally 
		{
			System.out.println("Clen up Logic here");
		}
	}


	

}
