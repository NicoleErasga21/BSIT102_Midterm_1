import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.*;

public class AgeGetter 
{
	public static void main (String []args) throws Exception
	{
		Scanner scannerErasga = new Scanner(System.in); 
		
		SimpleDateFormat formatErasga = new SimpleDateFormat("dd-M-yyyy");
		
		Calendar calendarNicole = new GregorianCalendar();
		
		System.out.println("Input Birthday Date:"); 
		
		String input_date = scannerErasga.nextLine(); 
		
		Date Birthday = formatErasga.parse(input_date);
		
		int Birthyear = calendarNicole.get(Calendar.YEAR); 
		
		calendarNicole.setTime(Birthday); 
		
		int Year = calendarNicole.get(Calendar.YEAR);
		
		int AgeKo =  Birthyear - Year; 
		System.out.println("My age is: " +AgeKo); 
		
		
		
		/* Another working method na legit
		System.out.println("Input Birthday Date:");
		String input_date = sc.nextLine();
		Date date = format.parse(input_date);
		
		Calendar CalendarBirthday = Calendar.getInstance();
		CalendarBirthday.setTime(date);
		int Bday =CalendarBirthday.get(Calendar.YEAR);
		
		Date DateNgayon = new Date();
		Calendar CalendarKo = Calendar.getInstance();
		CalendarKo.setTime(DateNgayon);
		int DateToday =CalendarKo.get(Calendar.YEAR);
	
		int age = DateToday - Bday;
		System.out.println("My Age is: " +age);
		*/
		
		
				
	}
}