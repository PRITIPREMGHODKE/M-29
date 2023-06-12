//program to demonstratre on Stream
package org.stjohn.stremapi;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Stream<Integer>s1=Stream.of(11,25,78,90,00,80);
		s1.forEach((i)->System.out.print(i+" "));
		

	}

}
