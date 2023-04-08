package org.stjohn.looping;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		
		while(i<=n)
		{
			System.out.println(i+' ');
			i++;
		}	
	}

}
