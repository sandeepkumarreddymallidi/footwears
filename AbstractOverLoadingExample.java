package com.footwear;
abstract class Adidas1
{
	public abstract void price(double mrp);
	public abstract void price(double mrp,int discount);
}
class Cost extends Adidas1{
	public void price(double mrp)
	{
		System.out.println("the cost of the shoe is "+mrp+"rupees");
	}
	public void price(double mrp,int discount)
	{
		double x=mrp*discount;
		x=x/100;
		mrp=mrp-x;
		System.out.println("the cost price of the shoe after discount is"+String.format("%.2f", mrp)+"rupees");
	}
}
public class AbstractOverLoadingExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cost money=new Cost();
		money.price(3000.55d);
		money.price(3000.55d,25);
	}
}
