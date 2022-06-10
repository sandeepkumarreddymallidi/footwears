package com.footwear;

import java.util.Set;
import java.util.TreeSet;


public class CollectionExample {

	public static void main(String[] args) {
		TreeSet<Integer> hs=new TreeSet<Integer>();
		hs.add(50);
		hs.add(20);
		hs.add(60);
		hs.add(30);
		hs.add(35);
		hs.add(40);
		hs.add(90);
		hs.add(50);
		hs.add(100);
		hs.add(70);
		hs.add(200);
		hs.add(80);
		System.out.println(hs);
		System.out.println(hs.contains(100));
		System.out.println(hs.size());
		System.out.println(hs.first());//it will get the first element in the set
		
		
		System.out.println(hs.floor(37));/*it will return less than or equal to the given element,
											or null if there is no such element*/
		System.out.println(hs.ceiling(34));/*it will return greater than or equal to the given element,
											or null if there is no such element*/
		System.out.println(hs.tailSet(20));/*it will return sorted set depending upon the input we had given.
		System.out.println(hs.tailSet(30, true));/*it will return sorted set,if we not needed to print from the given element,
													we only need remaining elements then we keep it as a false,otherwise we keep it as true*/
		
		System.out.println(hs.subSet(35,100));//it will return the sorted set from  the given elements
		System.out.println(hs.subSet(35,true,100,true));/*it will return the sorted set from the fromelement to toelement 
															if we keep them as a true*/
		System.out.println(hs.pollFirst());//it will return small value and remove it  
		System.out.println(hs.pollLast());// it will return height value and remove it
		System.out.println(hs.remove(50));//remove element 50 and return true
		System.out.println(hs);
		System.out.println(hs.removeAll(hs));//remove all objects and return true
		System.out.println(hs);
		
	}

}
