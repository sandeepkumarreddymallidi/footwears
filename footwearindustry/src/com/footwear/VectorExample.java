package com.footwear;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class VectorExample {

	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		Vector<String> vs=new Vector<String>();
		vs.add("sandeep");
		vs.add("sundhar");
		vs.add("sai");
		vs.add("kumar");
		vs.add("ravi");
		vs.add("mohan");
		vs.add("phani");
		vs.add("kittu");
		vs.add("vinay");
		vs.add("tarun");
		vs.add("arvind");
		vs.add("sai");
		vs.add("kumar");
		vs.add("ravi");
		vs.add("mohan");
		vs.add("phani");
		vs.add("kittu");
		vs.add("vinay");
		st.push("sai");
		st.push("kumar");
		st.push("ravi");
		st.push("mohan");
		st.push("phani");
		st.push("kittu");
		st.push("vinay");
		st.push("tarun");
		st.push("arvind");
		System.out.println(st);//insertion order preserved
		System.out.println(st.pop());//remove last element and return that element
		System.out.println(st);
		System.out.println(st.add("arvind"));//it will add the element in the last
		System.out.println(st);
		System.out.println(st.addAll(vs));//it will add vector objects in the last
		System.out.println(st);
		System.out.println(st.addAll(2, vs));//it will add vector object from the second position
		System.out.println(st);
		System.out.println(st.indexOf("sandeep"));//it will find the index of first occupied object
		System.out.println(st.lastIndexOf("sandeep"));//it will find the last index of the object
		System.out.println(st.capacity());//it will show the current capacity of the vector,when it gets full it will resize the capacity
		System.out.println(st.get(28));//it will get the 28 object value
		System.out.println(st.size());//it will get the total number of value
		System.out.println(st.peek());//it will return which object is at last
		java.util.Iterator<String> it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
