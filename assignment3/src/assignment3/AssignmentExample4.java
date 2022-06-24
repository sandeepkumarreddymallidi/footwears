package assignment3;

import java.util.LinkedList;
import java.util.List;

class DeleteDuplicate
{
	public static void deleteDuplicate(List<Integer> li) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		for(int i:li) {
			if(l.contains(i)) {
				
			}else {
				l.add(i);
			}
		}
		System.out.println(l);
	
	}
}
public class AssignmentExample4 {

	public static void main(String[] args) {
		List<Integer> li=new LinkedList<Integer>();
		li.add(24);
		li.add(34);
		li.add(94);
		li.add(67);
		li.add(24);
		li.add(67);
		li.add(65);
		li.add(77);
		li.add(88);
		System.out.println(li);
		DeleteDuplicate.deleteDuplicate(li);
	}

}
