package day8.programmatic;

import org.springframework.stereotype.Component;

@Component 
public class Test {
	public Test() {
		System.out.println("Test initiated");
	}
	public void doTest() {
		System.out.println("Test works...");
	}

}
