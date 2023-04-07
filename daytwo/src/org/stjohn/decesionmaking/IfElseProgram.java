package org.stjohn.decesionmaking;
import java.util.Scanner;
public class IfElseProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		
		if(age>18 && weight>0)
		{
		
			System.out.println("Eligible To Donate The Blood");
	}
		else
		{
			System.out.println("Not Eligible To Donate The Blood");
}
		
	}

}
