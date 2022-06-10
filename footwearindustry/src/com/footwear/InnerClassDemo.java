package com.footwear;
class Booking
{
	public void orderPlace()
	{
		System.out.println("order was placed");
		//Packed post=new Packed();
		//post.delivered();
	}
	class Packed
	{
		public void delivered()
		{
			System.out.println("order was delivered");
		}
	}
	
}

public class InnerClassDemo {

	public static void main(String[] args) {
		Booking item=new Booking();
		item.orderPlace();
		Booking.Packed post=item.new Packed();
		post.delivered();

	}

}
