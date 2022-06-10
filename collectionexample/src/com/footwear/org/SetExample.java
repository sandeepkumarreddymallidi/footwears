package com.footwear.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
class Shoes {
	private float size;
	private float cost;
	private String color;
	
	public Shoes() {
		
	}
	public Shoes(float size, float cost, String color) {
		this.size = size;
		this.cost = cost;
		this.color = color;
	}
public void setSize(float size) {
	this.size=size;
}
public void setColor(String color) {
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
public String getColor()
{
	return color;
}
@Override
public String toString() {
	return "[size=" + size + ", cost=" + cost + ", color=" + color + "]";
}

}


public class SetExample {

	public static void main(String[] args) {
		//Set<Shoes> hs=new TreeSet<Shoes>();
		List<Shoes> hs=new ArrayList<Shoes>();
		Shoes fs=new Shoes();
		fs.setColor("blue");
		fs.setCost(2500);
		fs.setSize(8);
		hs.add(fs);
		fs=new Shoes();
		fs.setColor("black");
		fs.setCost(3500);
		fs.setSize(9);
		hs.add(fs);
		fs=new Shoes();
		fs.setColor("green");
		fs.setCost(4500);
		fs.setSize(9.5f);
		hs.add(fs);
		fs=new Shoes();
		fs.setColor("brown");
		fs.setCost(3800);
		fs.setSize(8);
		hs.add(fs);
		fs=new Shoes();
		fs.setColor("red");
		fs.setCost(4200);
		fs.setSize(10);
		hs.add(fs);
		
		System.out.println("shoes"+hs);
		Iterator<Shoes> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		}

}
