package assignment3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class RatationList{
	public static void rotation(LinkedList<Integer> li, int k) {
		while(k!=0) {
			li.addFirst(li.removeLast());
			k--;
		}
		System.out.println(li);
		}
}

public class AssignmentExample3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(25);
		li.add(15);
		li.add(35);
		li.add(24);
		li.add(26);
		li.add(38);
		li.add(42);
		System.out.println(li);
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		RatationList.rotation(li,k);
		sc.close();
		

	}

}
