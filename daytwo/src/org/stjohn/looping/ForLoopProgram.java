package org.stjohn.looping;
import java.util.Scanner;


public class ForLoopProgram {

	public static void main(String[] args) {
		//Print 1 to N numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number(N): ");
		int N = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" ");
		}  
		

	}

}
