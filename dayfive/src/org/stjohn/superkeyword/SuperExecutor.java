//program to demonstrate on super keyword
package org.stjohn.superkeyword;

public class SuperExecutor {
           public static void main(String[] args) {
        	   Tiger t=new Tiger();
        	   t.display();
        	   //it will access child class properties
        	   System.out.println(t);
           }
}
