package com.footwear;
class Travelling
{
	public void entry() {
		System.out.println("welcome to the bus");
		
	}
	public void placeToTravel(String village_name) {
		System.out.println("I want to travel to the" +village_name);
	}
	public double ticketCost() {
		return 840.45d;
	}
	public String issueTicketTo(String village_name) {
		return village_name;
	}
}

public class MethodExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travelling travel=new Travelling();
		travel.entry();
		travel.placeToTravel("ravulapalem");
		System.out.println("the cost of the ticket is " +travel.ticketCost());
		System.out.println("Have a safe journey to "+travel.issueTicketTo("ravulapalem"));
		
	}

}
