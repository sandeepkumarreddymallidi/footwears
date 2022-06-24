package assignment3;

import java.util.Arrays;

public class NumberExample {

	public static void main(String[] args) {
		int num=9996;
		String s=Integer.toString(num);
		int[] a=new int[s.length()];	
		for(int i=0;i<s.length();i++)
		{
			char x=s.charAt(i);
			switch(x) {
			case '9':
				char[] c=s.toCharArray();
				c[i]='6';
				a[i]=Integer.parseInt(new String(c));
				break;
			case '6':
			   char[] y=s.toCharArray();
			   y[i]='9';
			   a[i]=Integer.parseInt(new String(y));
			   break;
		
			}
		}
		Arrays.sort(a);
		System.out.println(a[s.length()-1]);
	}
}