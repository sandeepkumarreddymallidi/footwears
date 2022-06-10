package com.footwear;
 interface  AutoMobile
 {
	 void cost();
	 void size();
	 void color();
 }
 class Puma4 implements AutoMobile 
 {
	 public void cost() {
		 System.out.println("the cost is 2500");
	 }
	 public void size()
	 {
		 System.out.println("the size is 8");
	 }
	 public void color() {
		 System.out.println("the colour is blue");
	 }
 }
 class Adidas5 implements AutoMobile 
 {
	 public void cost() {
		 System.out.println("the cost is 5500");
	 }
	 public void size()
	 {
		 System.out.println("the size is 10");
	 }
	 public void color() {
		 System.out.println("the colour is red");
	 }
 }
 class FactorMethod{
	public static AutoMobile getElement(String name)
	 {
		 if(name.equals("Puma4"))
		 {
			 return new Puma4();
		 }
		 if(name.equals("Adidas5"))
		 {
			 return new Adidas5();
		 }
		 else {
			return null;
		 }
	 }
	public  AutoMobile getElements(String name)
	 {
		 if(name.equals("Puma4"))
		 {
			 return new Puma4();
		 }
		 if(name.equals("Adidas5"))
		 {
			 return new Adidas5();
		 }
		 else {
			return null;
		 }
	 }
 }
public class FoctorMethodExample {

	public static void main(String[] args) {
		AutoMobile am=FactorMethod.getElement("Puma4");
		am.color();
		am.cost();
		am.size();
		FactorMethod fm=new FactorMethod();
		AutoMobile cf=fm.getElements("Adidas5");
		cf.color();
		cf.cost();
		cf.size();


	}

}
