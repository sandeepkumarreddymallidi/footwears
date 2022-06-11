package libraryapplication;

public class LibraryFactorMethod {
	public LibraryUser getDetails(int age) {
		if (age<12)
		{
			return new Kidusers();
			}
		else if(age>12)
		{
			return new AdultUser();
		}
		else {
			return null;
		}
	}

}
