//program to demonstrate on bitwise operator
//&,|,^,>>,<<
package org.stjohn.operation;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		int result1=10 & 7;
		int result2 = 10|7;
		int result3 = 10^7;
		int result4 = 8>>1;
		int result5 =8<<2;
		System.out.println(result1); //2
		System.out.println(result2); //15
		System.out.println(result3); //13
		System.out.println(result4); //4
		System.out.println(result5); //32

	}

}
