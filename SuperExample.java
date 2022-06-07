package com.footwear;
class Nike2
{
	int mrp;
	public Nike2(int mrp)
	{
		this.mrp=mrp;
	}
	public void cost()
	{
		System.out.println("the cost price of the footWear is "+mrp);
	}
}
class OfferSale extends Nike2
{	
	private int mrp;
	public OfferSale(int mrp)
	{
		super(2000);
		this.mrp=mrp;
	}
	public void cost()
	{
		super.cost();
		System.out.println("the original cost price of the footWear is "+super.mrp+"the offer price of the footwear is"+mrp);
	}
}

public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nike2 offer=new OfferSale(1500);
		offer.cost();
	}

}
