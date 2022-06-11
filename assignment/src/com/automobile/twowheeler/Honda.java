package com.automobile.twowheeler;

public class Honda {
	private int speed;
	private String model;
	private String number;
	private String owner;
	
	public Honda(int speed, String model, String number, String owner) {
		this.speed = speed;
		this.model = model;
		this.number = number;
		this.owner = owner;
	}


	public int getSpeed() {
		return speed;
	}


	public void cdPlayer() {
		
		System.out.println("turn volume button right to increase volume");
		System.out.println("turn volume  button left to decrease volume");
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
