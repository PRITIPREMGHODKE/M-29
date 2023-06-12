package org.stjohn.junit;
import org.junit.jupiter.api.RepeatedTest;
public class RepeatedDemo {
	@RepeatedTest(3)
	void test() {
		System.out.println("Hello ");
	}

}
