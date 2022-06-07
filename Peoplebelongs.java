package com.footwear;
class State{
	 String village_name;
	 long pincode;
	 String district_name; 
	 static String state_name;
	}
public class Peoplebelongs {

	public static void main(String[] args) {
		State ap=new State();
		ap.village_name="ravulapalem";
		ap.pincode=533238l;
		ap.district_name="East godavari";
		State.state_name="andhra pradesh";
		System.out.println("village_name "+ap.village_name);
		System.out.println("pincode "+ap.pincode);
		System.out.println("district_name "+ap.district_name);
		System.out.println("statename "+State.state_name);
		State assam=new State();
		System.out.println("village_name "+assam.village_name);
		System.out.println("pincode "+assam.pincode);
		System.out.println("district_name "+assam.district_name);
		System.out.println("statename "+State.state_name);
	}
}
