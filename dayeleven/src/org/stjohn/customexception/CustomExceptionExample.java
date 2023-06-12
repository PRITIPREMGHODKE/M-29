//program to demonstrate on custom exceptiont
package org.stjohn.customexception;
import   java.util.Scannner;
public class CustomExceptionExample {

	public static void main(String[] args) {
		Scannner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		try {
			if(id.equals("pritighodke@gmail.com")&&
					password.equals("priti@123"))
			{
				System.out.println("Credential Match");
			}
			else
			{
				throw new LoginCredential("Invalid Credentials");
				
			}
		}
		//handling using UD exception
		catch(LoginCredential e)
		{
			System.out.println("Exception handled "+e);
		}
		

	}

}
