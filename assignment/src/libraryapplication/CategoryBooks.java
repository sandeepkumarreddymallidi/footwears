package libraryapplication;

import java.util.ArrayList;
import java.util.List;

public class CategoryBooks {
	public static List<String> KidCategory() {
		List<String> arr=new ArrayList<String>();
		arr.add("super heros");
		arr.add("manga");
		arr.add("slice of life");
		arr.add("humor");
		arr.add("science fiction");
		return arr;
	}
	public static List<String> adultCategory() {
		List<String> arr=new ArrayList<String>();
		arr.add("action");
		arr.add("drama");
		arr.add("comedy");
		arr.add("inspiration");
		arr.add("novels");
		return arr;
	}
}
