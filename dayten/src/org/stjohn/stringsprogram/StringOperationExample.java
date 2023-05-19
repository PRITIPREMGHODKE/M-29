//demonstrate on string built in function
package org.stjohn.stringsprogram;

public class StringOperationExample {

	public static void main(String[] args) {
		//using new keyword
		String str1=new String("pritu");
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.lastIndexOf('r'));
		System.out.println(str1.hashCode());
		System.out.println(str1.concat("vaish"));
		System.out.println(str1+"kriti");
		

	}

}
