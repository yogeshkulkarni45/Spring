package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day7.GreetingServices;



public class SpringSimpleExamplemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configPath = "spring-config.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		
		//Obtaining the object (bean) against its ID
		Object obj = ctx.getBean("myBean");
		GreetingServices gs = (GreetingServices)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj = ctx.getBean("myBean2");
		gs = (GreetingServices)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
	}
	}


