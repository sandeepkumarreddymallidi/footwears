package com.footwear;

public class FootWear3{
	private float size;
	private float cost;
	private String color;
	
	public FootWear3(float size, float cost, String color) {
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
public float getcost()
{
	return cost;
}
public String getcolor()
{
	return color;
}
}