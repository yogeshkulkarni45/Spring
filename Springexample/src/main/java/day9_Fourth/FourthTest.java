package day9_Fourth;



import org.springframework.stereotype.Component;


@Component
public class FourthTest {
	public FourthTest() {
		System.out.println("Fourth Test Instantiated");
	}
	
	public void doTest() {
		System.out.println("Fourth Test Works");
	}
}
