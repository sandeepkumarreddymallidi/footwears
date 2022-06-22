package assignment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assingment2 {

	public static void main(String[] args) {
		List<Integer> ls=new LinkedList<Integer>();
		List<Integer> lss=new LinkedList<Integer>();
		ls.add(1);
		ls.add(1);
		ls.add(2);
		ls.add(2);
		ls.add(3);
		ls.add(3);
		ls.add(4);
		ls.add(4);
		ls.add(5);
		ls.add(5);
		ls.add(6);
		int size=ls.size();
		System.out.println(size);
		Iterator<Integer> it=ls.listIterator();
			while(it.hasNext()) {
				Integer x=it.next();
				while(it.hasNext()) {
				Integer y=it.next();
					if(x!=y)
					{
						lss.add(x);
					}
				}
			}
		System.out.println(lss);
		
	}
		

}
