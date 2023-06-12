//map operation
package org.stjohn.stremapi;

import java.util.Arrays;
import java.util.List;

public class MappingExample {

	public static void main(String[] args) {
		//using collection
		List<String>obj=Arrays.asList("Priti","Pratibha","Kriti");
		obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));
		
	}

}
