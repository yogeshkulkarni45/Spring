package day9;



import org.springframework.stereotype.Component;


@Component
public class FirstTest {
	public FirstTest() {
		System.out.println("First Test Instantiated");
	}
	
	public void doTest() {
		System.out.println("First Test Works");
	}
}
