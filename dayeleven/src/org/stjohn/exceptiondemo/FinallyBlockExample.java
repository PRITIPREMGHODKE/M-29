//program to demonstarte on when finaaly block is not executed
package org.stjohn.exceptiondemo;

public class FinallyBlockExample {

	public static void main(String[] args) {
		//array declaration and initialisation
		int arr[]=new int[] {101,33,78};
		System.out.println("Array is: ");
		try {
		System.out.println(arr[3]);
		}
		catch(Exception e){
			System.out.println("Exception handled "+e);
			/*1. when we call  System.exit(0), it means no any further
			 * statement is executed */
			//System.exit(0)
		}
		finally
		
		{
			/*2.when finally block contain exception code*/
			System.out.println(13/0);
			System.out.println("finally block");
		}
		

	}

}
