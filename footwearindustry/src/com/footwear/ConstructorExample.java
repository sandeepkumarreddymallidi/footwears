package com.footwear;
class Puma2
{
	private double mrp;
	private String color;
	private float size;
		public Puma2(double mrp,String color,float size)
		{
			this.mrp=mrp;
			this.color=color;
			this.size=size;
		}
		public double getMrp()
		{
			return mrp;
		}
		public String  getColor()
		{
			return color;
		}
		public float getSize()
		{
			return size;
		}
		public void setMrp(double mrp)
		{
			this.mrp=mrp;
		}
		public void setColor(String color)
		{
			this.color=color;
		}
		public void setSize(float size)
		{
			this.size=size;
		}
		
}

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puma2 foot=new Puma2(456,"blue",8);
		System.out.println("the details of the Footwear is\n"+foot.getMrp()+"\n"+foot.getColor()+"\n"+foot.getSize());
		foot.setMrp(2000);
		System.out.println("the details of the Footwear is\n"+foot.getMrp()+"\n"+foot.getColor()+"\n"+foot.getSize());
		
	}

}
