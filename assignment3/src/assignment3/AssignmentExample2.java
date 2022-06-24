
	package assignment3;

import java.util.Scanner;

public class AssignmentExample2 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dividend :");
		int dividend=sc.nextInt();
		System.out.println("enter divsor :");
		int divsor=sc.nextInt();
		int p=0;
		if(dividend<0) {
			p++;
			dividend=-dividend;
		}
		if(divsor<0) {
			p++;
			divsor=-divsor;
		}
		int x=0;
		while(dividend>=divsor) {
			dividend=dividend-divsor;
			x++;
		}
		if(p==1) {
			System.out.println(-x);
		}else {
			System.out.println(x);
		}
		sc.close();
	}
}


