package com.footwear;

import java.util.TreeSet;
import com.footwear.FootWear3;


public class CollectionExample2 {

	public static void main(String args[]) {
		TreeSet<FootWear3> hs=new TreeSet<FootWear3>();
		FootWear3 fs=new FootWear3(8,2500,"blue");
		hs.add(fs);
		fs=new FootWear3(9,3500,"blue");
		hs.add(fs);
		System.out.println(hs);

	}

}
