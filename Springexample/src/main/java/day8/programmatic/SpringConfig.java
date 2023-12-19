package day8.programmatic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import day7.WelcomeGreeting;
import day7.GreetingServices;
import day7.HelloService;

import day8.UserGreetingService;
import day8.UserService;

public class SpringConfig {
	@Bean //Marks this method as a bean declaration or registration method
	public GreetingServices helloBean() {
		GreetingServices service = new HelloService();//<bean class="day7.HelloService id="helloBean">
		return service;
	}
	@Bean
	public GreetingServices welcomeBean() {
		GreetingServices service = new WelcomeGreeting();//<bean class="day7.WelcomeService" id="welcomeBean">
		return service;
	}
	@Bean("myUserBean") //Registers a bean of type UserService against an ID: myUserBean
	public GreetingServices userBean() {
		GreetingServices service = new UserService();
		return service;
	}
	
	@Bean("greetingBean")
	@Scope("prototype")//<bean scope="prototype">
	@Lazy//<bean lazy-init="true">
	public GreetingServices userGreetingBean() {
		GreetingServices service = new UserGreetingService("Welcome", 45, "Jack");
		return service;
	}

}
