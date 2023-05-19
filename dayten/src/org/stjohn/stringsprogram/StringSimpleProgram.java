//program to demonstrate a string using string literal and new keyword
package org.stjohn.stringsprogram;

public class StringSimpleProgram {

	public static void main(String[] args) {
		//using string literal
		String str1="Priti";
		System.out.println("Using string literal: "+str1);
		
		//using new keyword
				String str2=new String("Priti");
				System.out.println("Using new keyword: "+str2);
		/*when the string is create by using new keyword and 
		 * *both the string are same it will create a memory for that 
		 * *string and hence using == we will get it as different(false)*/
				System.out.println(str1==str2);
				System.out.println(str1.equals(str2));
	}

}
