// Program to demonstrate on label for loop
package org.stjohn.looping;

public class LabelledForLoopProgram {

	public static void main(String[] args) {
//		label
			outer:
				for(int i=1;i<=5;i++)
				{
					System.out.println();
					inner:
						for(int j=1;j<=5;j++)
						{
						if(j==3)
//							it will skip 3
							continue;
						System.out.print(j+" ");
					}
					for(int j=1;j<=5;j++)
					{
					System.out.print(j+" ");
					if(j==3)
//						it terminates 
						break;
					}
				
				}

		}

	}