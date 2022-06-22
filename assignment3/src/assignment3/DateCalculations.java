package assignment3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateCalculations
{
	 public static void main(String[] args)
	    {
		 Date dt2=new Date(2022/06/21);
		 SimpleDateFormat sfd=new SimpleDateFormat("y-MM-dd");
		 System.out.println(sfd.format(dt2));
		 String str=sfd.format(dt2);
		 LocalDate fromDate=LocalDate.of(2022, 01, 05);
		 LocalDate toDate=LocalDate.of(2022, 2, 05);
		 long days=ChronoUnit.DAYS.between(fromDate, toDate);
		 System.out.println("Days"+days);
			 LocalDate dt = LocalDate.parse("");
			        System.out.println(dt);
			        LocalDate dt1 = LocalDate.parse("2018-11-14");
			        System.out.println(dt1);
			        System.out.println(dt1.compareTo(dt));
	    }
	 

	    }
	     