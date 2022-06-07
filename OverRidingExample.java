package com.footwear;
class FootWear
{
	public void size(int inches)
	{
		System.out.println(" size details mentioned "+inches);
	}
	public void cost(float prices)
	{
		System.out.println("cost details mentioned is "+ prices+"rupees");
	}
	public void type(String categeries)
	{
		System.out.println("type is mentioned " +categeries);
		
	}
	public void color(String colour)
	{
		System.out.println("the colour is "+colour);
	}
	
}
class Adidas extends FootWear{
	public void size(int inches)
	{
		System.out.println(" size of the adidas footwear is "+inches);
	}
	public void cost(float prices)
	{
		System.out.println("cost of the adidas footwear is "+ prices +"rupees");
	}
	public void type(String categeries)
	{
		System.out.println("type of the adidas footwear is" +categeries);
		
	}
	public void color(String colour)
	{
		System.out.println("the colour of the adidas footwear is  "+colour);
	}
	
	
}
class puma extends FootWear{
	public void size(int inches)
	{
		System.out.println(" size of the puma footwear is "+inches);
	}
	public void cost(float prices)
	{
		System.out.println("cost of the puma footwear is "+ prices +"rupees");
	}
	public void type(String categeries)
	{
		System.out.println("type of the puma footwear is" +categeries);
		
	}
	public void color(String colour)
	{
		System.out.println("the colour of the puma footwear is  "+colour);
	}
}
class Nike extends FootWear{
	public void size(int inches)
	{
		System.out.println(" size of the nike footwear is "+inches);
	}
	public void cost(float prices)
	{
		System.out.println("cost of the nike footwear is "+ prices +"rupees");
	}
	public void type(String categeries)
	{
		System.out.println("type of the nike footwear is" +categeries);
		
	}
	public void color(String colour)
	{
		System.out.println("the colour of the nike footwear is  "+colour);
	}
	
}
class Skechers extends FootWear{
	public void size(int inches)
	{
		System.out.println(" size of the Skechers footwear is "+inches);
	}
	public void cost(float prices)
	{
		System.out.println("cost of the Skechers footwear is "+ prices +"rupees");
	}
	public void type(String categeries)
	{
		System.out.println("type of the Skechers footwear is" +categeries);
		
	}
	public void color(String colour)
	{
		System.out.println("the colour of the Skechers footwear is  "+colour);
	}
	
}
public class OverRidingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootWear foot=new FootWear();
		foot.size(0);
		foot.cost(0);
		foot.type(null);
		foot.color(null);
		foot=new Adidas();
		foot.size(8);
		foot.cost(1500.0f);
		foot.type("filpflop");
		foot.color("black");
		foot=new puma();
		foot.size(9);
		foot.cost(2000.0f);
		foot.type("sneakers");
		foot.color("blue");
		foot=new Nike();
		foot.size(10);
		foot.cost(2500.0f);
		foot.type("shoes");
		foot.color("brown");
		foot=new Skechers();
		foot.size(11);
		foot.cost(3000.0f);
		foot.type("sportsshoes");
		foot.color("red");
	}

}
