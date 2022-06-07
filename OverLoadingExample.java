package com.footwear;
class Person{
	public void name(String name)
	{
		System.out.println("my name friends call me "+name);
	}
	public void name(String first_name,String last_name)
	{
		System.out.println("my name is " +first_name +" "+last_name);
	}
	public void name(String first_name,String last_name,String surname)
	{
		System.out.println("my name fullname is " +first_name +" "+last_name+" "+surname);
	}
	
}

public class OverLoadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.name("sandeep");
		p.name("sandeep","kumar reddy");
		p.name("sandeep","kumar reddy","mallidi");
		
	}
}
