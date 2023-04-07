//program to demonstrate on logical operator
//&&,||,!
package org.stjohn.operation;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		boolean result1=(5>2) && (4==3);
		boolean result2 = (5>2) || (4==3);
		boolean result3 = !(3<=1);
		System.out.println(result1); //False
		System.out.println(result2); //True
		System.out.println(result3); //True
			

	}

}
