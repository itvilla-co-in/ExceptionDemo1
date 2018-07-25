package Demo1;

import java.util.Scanner;

public class Exception2 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Exception Demo");
		
		try
		{
		String name = null;
		System.out.println("Lets try to display null " + name);
		System.out.println("Lets try to display length of null " + name.length());
		}catch (NullPointerException e)
		{
			System.out.println(" You cannot use length function with string "+ e);
		}
		finally 
		{
			System.out.println("Clen up Logic here");
		}
	}


	

}
