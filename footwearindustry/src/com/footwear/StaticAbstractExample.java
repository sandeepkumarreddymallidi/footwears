package com.footwear;
abstract class StaticExample{
	public static abstract void headQuarters();
	/*abstract method supports only public and protected accesses modifier,
	 * abstract method will be override in the their subclasses
	 * ,but static method cannot be override*/
	public static void welcome() {
		System.out.println("welcome to the footwear stores");
	}
}

public class StaticAbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample.welcome();
	}

}
