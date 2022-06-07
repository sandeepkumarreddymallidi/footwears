package com.footwear;
class Sandeep
{
	void display() {
		System.out.println("hai Sandeep");
	}
}
class Suresh
{
	void display() {
		System.out.println("hello suresh");
	}
}
public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Suresh sur=new Sandeep();
		sur.display();
		
		

	}

}
