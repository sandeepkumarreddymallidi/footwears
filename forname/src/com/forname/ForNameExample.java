package com.forname;


public class ForNameExample {
	public static void main(String args[]) throws ClassNotFoundException {
		{
			System.out.println("this anonimous block");
		}
		
		Class.forName("com.forname.ForNameExample2");
		System.out.println("main method");
		
		
	}

}
