package day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		
		String configPath = "spring-config.xml";
		ApplicationContext cgx= new ClassPathXmlApplicationContext(configPath);
		Object obj;
		obj=cgx.getBean("myBean");
		GreetingServices gs=(GreetingServices)obj;
		String Reply=gs.sayGreeting();
		System.out.println(Reply);
		
		obj=cgx.getBean("myBean2");
		gs=(GreetingServices)obj;
		Reply=gs.sayGreeting();
		System.out.println(Reply);
		

	}

}
