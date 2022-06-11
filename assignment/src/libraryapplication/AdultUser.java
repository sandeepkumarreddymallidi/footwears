package libraryapplication;

import java.util.List;
import java.util.Scanner;

public class AdultUser implements LibraryUser{
	public void registerAccount()
	{
		System.out.println("welcome to adult library");
		requestBook();
	}
	public void requestBook() {
		System.out.println("enter the fiction books");
		Scanner sc=new Scanner(System.in);
		String book=sc.nextLine();
		List<String> arr=CategoryBooks.adultCategory();
        if(arr.contains(book))
        {
		System.out.println("book should  be returned within 7 days.");
		}
		else 
		{
			System.out.println("the book you want will be available short");
		}
        sc.close();
	}
	}
