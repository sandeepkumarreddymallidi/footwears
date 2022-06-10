package com.footwear;
class OrderFood
{
	public void menu() {
		System.out.println("you have order in Zomato");
		//OrderFood.Booked.status();
		//Booked food=new Booked();
		//food.deliveryTime();
	}
	static class Booked{
		int time=45;
		public static void status()
		{
			System.out.println("your order was booked");
		}
		public void deliveryTime()
		{
			System.out.println("your order was reached with in "+time+"minutes");
		}
	}
}

public class StaticInnerClassDemo {

	public static void main(String[] args) {
		
		OrderFood menuBook=new OrderFood();
		menuBook.menu();
		OrderFood.Booked.status();
		OrderFood.Booked reach=new OrderFood.Booked();
		reach.deliveryTime();
		
	}

}
