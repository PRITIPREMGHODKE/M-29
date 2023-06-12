//program to demonstrate on custom exception
package org.stjohn.customexception;

import java.io.PrintStream;
import java.io.PrintWriter;

//to create custom exception we need to extends an exception
public class LoginCredential extends Exception{
	//private data member
	private String str1;

	
	//parameterized constructor
	public LoginCredential() {
		super();
		this.str1 = str1;
	}


	@Override
	public String toString() {
		return "LoginCredential [str1=" + str1 + "]";
	}
    

	
	

}
