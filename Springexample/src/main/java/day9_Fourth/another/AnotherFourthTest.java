package day9_Fourth.another;

import org.springframework.stereotype.Component;

@Component
public class AnotherFourthTest {
	public AnotherFourthTest() {
		System.out.println("Another fourth test instantiated");		
	}
	public void doTest() {
		System.out.println("Another fourth test works.");
	}
}
