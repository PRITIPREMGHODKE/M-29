//string buffer
package org.stjohn.stringsprogram;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer("priti");
		//by default ,capacity of any empty string is 16
		System.out.println(str1.capacity());//bydefault +length
		System.out.println(str1.charAt(2));
	}

}
