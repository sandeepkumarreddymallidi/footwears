package libraryapplication;

import java.util.List;
import java.util.Scanner;

public class Kidusers implements LibraryUser {
	public void registerAccount()
	{
		System.out.println("welcome to kids library");
		requestBook();
	}
	public void requestBook() {
		System.out.println("enter the comic books");
		Scanner sc=new Scanner(System.in);
		String book=sc.nextLine();
		List<String> arr=CategoryBooks.KidCategory();
        if(arr.contains(book)){
		System.out.println("book should  be returned within 10 days.");
		}
		else {
			System.out.println("the book you want will be available short");
		}
        sc.close();
	}
}
