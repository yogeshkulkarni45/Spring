package day8;

import day7.GreetingServices;

public class UserService implements GreetingServices {
	public UserService() {
		System.out.println("USer initiated");
	}
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Welcome User";
	}

}
