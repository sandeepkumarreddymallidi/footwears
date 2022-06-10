package com.footwear.org;

class Footwear {
	private float size;
	private float cost;
	private String color;
	
	public Footwear() {
		
	}
	public Footwear(float size, float cost, String color) {
		this.size = size;
		this.cost = cost;
		this.color = color;
	}
public void setSize(float size) {
	this.size=size;
}
public void setcolor(String color) {
	this.color=color;
}
public void setCost(float cost) {
	this.cost=cost;
}
public float getSize()
{
	return size;
}
public float getCost()
{
	return cost;
}
public String getcolor()
{
	return color;
}
}

