package railways;

import java.util.Random;

public class Testcompartment {

	public static void main(String[] args) {
		
		Random ran=new Random();
		String[] str=getRandom(ran);
		Compartment obj=null;
		getCompartment(str,obj);
		for(int i=0;i<str.length;i++)
		{
			System.out.print(" "+str[i]+" ");
		}
		
	}
		public static String[]  getRandom(Random ran)
		{
			String[] compartment=new String[10];
			for(int i=0;i<compartment.length;i++)
			{
			 int s=ran.nextInt(4);
			if(s==0) 
			{
			 compartment[i]="FirstClass";
			}
			if(s==1) 
			{
				compartment[i]="Ladies";
			}
			if(s==2) 
			{
				compartment[i]="General";
			}
			if(s==3) 
			{
				compartment[i]="Luggage";
			}
		}
			return compartment;
		}
		public static void  getCompartment(String[] str,Compartment obj)
		{
			for(int i=0;i<str.length;i++)
			{
				if(str[i]=="FirstClass") {
					obj=new FirstClass();
					System.out.println(obj.notice());
				}
				if(str[i]=="Ladies") {
					obj=new Ladies();
					System.out.println(obj.notice());	
				}
				if(str[i]=="General") {
					obj=new General();
					System.out.println(obj.notice());	
				}
				if(str[i]=="Luggage"){
					obj=new Luggage();
					System.out.println(obj.notice());	
				}
			}
		}
		
}
