//program to  demonstrate on throw keyword
package org.stjohn.exceptiondemo;
import java.io.IOException;
public class ThrowKeywordExample {
   /*throw keyword is used to declare an exception */
	public static void donate(int age,int weight) throws IOException
	{
		if(age>18 && weight>55)
			System.out.println("person is eligible to denate the blood");
		else 
			/*throw keyword is used to throw an exception explicitly*/
			throw new IOException("Not Eliglible")
	}
	
	
	public static void main(String[] args) {
		

	}

}
