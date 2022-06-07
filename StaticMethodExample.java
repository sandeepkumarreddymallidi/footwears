package com.footwear;
class StaticVariable
{
	static int id=40;
	String name="sandeep";

	public void  normalMethodCall() {
		System.out.println("my id is " +id);
		System.out.println("my name is " +name);
	}
	public static void  staticMethodCall() {
		System.out.println("my id is " +id);
		System.out.println("my name is " +name);
		/* instance method and variables are accessed by using the class reference object,
	       but static method and variables are accessed by using class name.so the static method are not 
	       take the instance variables in their method*/
	}
}

public class StaticMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable instance=new StaticVariable();
		instance.normalMethodCall();

		StaticVariable.staticMethodCall();
			}

}
