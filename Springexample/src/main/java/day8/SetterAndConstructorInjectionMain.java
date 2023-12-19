package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day7.GreetingServices;

public class SetterAndConstructorInjectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("------Setter Injection-----------");
		
		Object obj = ctx.getBean("myBean6");
		GreetingServices gs = (GreetingServices) obj;
		String greeting = gs.sayGreeting();
		System.out.println(greeting);
		

		System.out.println("-------------------Constructor Injection------------------");
		obj = ctx.getBean("myBean7");
		gs = (GreetingServices)obj;
		greeting = gs.sayGreeting();
		System.out.println(greeting);
		
		obj = ctx.getBean("myBean8");
		gs = (GreetingServices)obj;
		greeting = gs.sayGreeting();
		System.out.println(greeting);
		
		

	}

}
