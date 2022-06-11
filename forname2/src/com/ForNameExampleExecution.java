package com;
class ForNameExample {
	static {
		System.out.println("this is static method");
	}

}

public class ForNameExampleExecution {
	public static void main(String args[]) throws ClassNotFoundException {
	Class.forName("forname2.com.ForNameExample");
	System.out.println("normal block");
	}
}
