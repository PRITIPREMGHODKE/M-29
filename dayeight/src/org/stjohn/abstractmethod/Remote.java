package org.stjohn.abstractmethod;
//if any class contains atleast one abstract one method
//then that class must be declare as abstract class
public class Remote {
	String cellName;
	abstract void FunctionRemote();
	abstract void Create();
	//abstract class contain abstract and non abstract method
	void display() {
		System.out.println("Cell name is"+cellName);
	}
}
//implementable class
class RemoteChild extends Remote{
	
	@Override
	void functionRemote() {
		System.out.println("Abstract method one");
	}

	@Override
	void create() {
		System.out.println("Abstract method two");
		
	}
}
