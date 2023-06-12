package org.stjohn.exceptiondemo;
import java.util.Scanner;
public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value for x and y:");
		int x=s.nextInt();
		int y=s.nextInt();
		
		//try block contain an exception code
		try {
		System.out.println(x/y);
		}
		//catch handled an exception
		catch(Exception e)
		{
			System.out.println("Exception handled"+e);
		}
		finally
		{
			System.out.println("finally block is always excuted");
		}
		
		

	}

}
