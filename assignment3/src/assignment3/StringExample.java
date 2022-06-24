package assignment3;

import java.util.regex.Pattern;

public class StringExample {

	public static void main(String[] args) {
		String s=new String();
		String str="[a-z]7";
		String str2="sandeep";
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str2.codePointAt(1));
		System.out.println(str.hashCode());
		System.out.println(str.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(Pattern.matches(str, str2));
		
	}

}
