package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle{
	private int speed;
	private String model;
	private String number;
	private String owner;
	
	public Hero(int speed, String model, String number, String owner) {
		this.speed = speed;
		this.model = model;
		this.number = number;
		this.owner = owner;
	}


	public int getSpeed() {
		return speed;
	}


	public void radio() {
		System.out.println("press power button to start or stop the music");
	}


	public String getModelName() {
		
		return model;
	}


	
	public String getRegistrationNumber() {
		
		return number;
	}


	
	public String getownerName() {
		
		return owner;
	}

}
