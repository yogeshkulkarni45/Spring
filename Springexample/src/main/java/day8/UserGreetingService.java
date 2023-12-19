package day8;

import day7.GreetingServices;

public class UserGreetingService implements GreetingServices {

	private String userName;
	private String greetingMessage;
	private int userAge;
	public UserGreetingService() {
		// TODO Auto-generated constructor stub
	}

	public UserGreetingService(String userName, String greetingMessage, int userAge) {
		System.out.println("UserGreetingService(String, String, int)");
		this.userName = userName;
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
	}

	public UserGreetingService(String greetingMessage, int userAge, String userName) {
		System.out.println("UserGreetingService(String, int, String)");
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("Setting user name");
		this.userName = userName;
	}

	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		System.out.println("Setting greeting message");
		this.greetingMessage = greetingMessage;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		System.out.println("Setting user age");
		this.userAge = userAge;
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		String finalMessage = greetingMessage + " " + userName + ", your age is " + userAge;
		return finalMessage;
	}

}
