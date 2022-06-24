package assignment3;

public class StringAssignment {
public static void main(String args[])
{
	int z=1,y=1;
	String str=new String();
	str="sandeep";
	int x=str.length();
	if(96>str.codePointAt(0)){
		
		for(int i=1;i<x;i++) {
			if(96>str.codePointAt(i)) {
				z++;
			}
			else if(96<str.codePointAt(i)) {
				y++;
			}
		}
		}
	if(x==z||x==y) {
	System.out.println("true");
	}
	else {
	System.out.println("false");
	}

}

}
