package org.stjohn.decesionmaking;
import java.util.Scanner;
public class NestedIfProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check its zero or not");
		int num = sc.nextInt();
		
		if(num>0)
		{
			//nested if
			if(num<0)
			{
				System.out.println("Non-zero number");
			}
			else
			{
				System.out.println("zero/non-zero");
			}
		}
		else
		{
			System.out.println("either non-zero/zero");
		}
		sc.close();
	}

}
