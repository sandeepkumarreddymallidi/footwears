package libraryapplication;

import java.util.Scanner;

public class LibraryTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		LibraryFactorMethod lmf=new LibraryFactorMethod();
		LibraryUser lu=lmf.getDetails(age);
		lu.registerAccount();
		sc.close();
	}

}
