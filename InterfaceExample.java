package com.footwear;
interface FootWearIndustries{
	 void companyEstablised();
	 void companyheadQuarters();
	
}
abstract class Adidas4 implements FootWearIndustries
{
	abstract void selectedFootwear();
	public void companyEstablised()
	{
		System.out.println("company established in 1948");
	}
	public void companyheadQuarters()
	{
		System.out.println("company located in herzogenaurach,germany");
	}
}
abstract class Shoe extends Adidas4
{
	void selectedFootwear() {
		System.out.println("you have selected shoe type");
	}
	abstract  void price(double mrp);
	 abstract  void color(String  colour);
	 abstract  void size(double inche);
}
class ShoeDetails extends Shoe
{
	public void price(double mrp)
	{
		System.out.println("the cost price of the is "+mrp+"rupees");
	}
	public void color(String colour)
	{
		System.out.println("the colour of the  footwear is "+colour+"colour");
	}
	public void size(double inche)
	{
		System.out.println("the size of the footwear is "+inche+"inche");
	}
}
abstract class Puma1 implements FootWearIndustries
{
	abstract void selectedFootwear();
	public void companyEstablised()
	{
		System.out.println("company established in 1948");
	}
	public void companyheadQuarters()
	{
		System.out.println("company located in herzogenaurach,germany");
	}
}
abstract class FlipFlop extends Puma1
{
	void selectedFootwear() {
		System.out.println("you have selected flipflop type");
	}
	abstract  void price(double mrp);
	 abstract  void color(String  colour);
	 abstract  void size(double inche);
}
class FlipFlopDetails extends FlipFlop
{
	public void price(double mrp)
	{
		System.out.println("the cost price of the is "+mrp+"rupees");
	}
	public void color(String colour)
	{
		System.out.println("the colour of the  footwear is "+colour+"colour");
	}
	public void size(double inche)
	{
		System.out.println("the size of the footwear is "+inche+"inche");
	}
}
public class InterfaceExample {
	public static void main(String args[]){
		FlipFlopDetails flipflop=new FlipFlopDetails();
		flipflop.companyEstablised();
		flipflop.companyheadQuarters();
		flipflop.selectedFootwear();
		flipflop.price(2500);
		flipflop.color("red");
		flipflop.size(8.5);
		ShoeDetails shoe=new ShoeDetails();
		shoe.companyEstablised();
		shoe.companyheadQuarters();
		shoe.selectedFootwear();
		shoe.price(2300);
		shoe.color("blue");
		shoe.size(9);
	}
	
}
