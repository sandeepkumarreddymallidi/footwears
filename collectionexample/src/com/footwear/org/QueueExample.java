package com.footwear.org;
import java.util.Collections;
import java.util.List;

public class QueueExample {

	public static void main(String[] args) {
		
		
		CollectionsExample eq=new CollectionsExample();
		List<Integer> li=eq.elements();
		System.out.println(li);
		System.out.println(Collections.binarySearch(li,45));
		
		
		
		
	}

}
