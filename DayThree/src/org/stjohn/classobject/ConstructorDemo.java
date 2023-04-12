package org.stjohn.classobject;
import java.util.Scanner;
public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in)
         int id;
		System.out.println("Enter the Customer ID: ");
		id=s.nextInt();
		//to read the nextline
		s.nextInt();
		System.out.println("Enter the Customer Name: ");
		name=s.nextLine();
		System.out.println("Enter the customer city: ");
		city=s.nextLine();
		
		//object creation 
		//default constructor invoked
		Customer c=new Customer();
		c.setCustomerID(id);
		c.setCustomerName(name);
		c.setCity(city);
		
		//below statement will call to tostring method
		System.out.println(c);
		
		System.out.println("Enter the Customer ID: ");
		id=s.nextInt();
		//read the nextline
		s.nextLine();
		System.out.println("Enter the Customer Nmae: ");
		
	
	}

}
