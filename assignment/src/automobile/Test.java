package automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Test {

	public static void main(String[] args) {
		Hero bike=new Hero(70,"audi q4","AP05CM1566","ravi");
		System.out.println(bike.getModelName());
		System.out.println(bike.getownerName());
		System.out.println(bike.getRegistrationNumber());
		System.out.println(bike.getSpeed());
		bike.radio();
		Honda bike2=new Honda(80,"benz c3","AP39JZ0124","lokesh");
		System.out.println(bike2.getModelName());
		System.out.println(bike2.getownerName());
		System.out.println(bike2.getRegistrationNumber());
		System.out.println(bike2.getSpeed());
		bike2.cdPlayer();
	}

}
