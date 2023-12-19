package day9;

import org.springframework.stereotype.Component;

@Component("third")
public class ThirdTest {
	public ThirdTest() {
		System.out.println("Third Test Instatiated");
	}
	
	public void doTest() {
		System.out.println("Third Test Works...");
	}
}
