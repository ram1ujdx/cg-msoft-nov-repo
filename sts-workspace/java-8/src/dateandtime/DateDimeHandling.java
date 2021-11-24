package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDimeHandling {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		
		
		LocalDate someDate=LocalDate.of(1994, 12, 25);
		
		
		
		System.out.println(someDate.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")));
		System.out.println(someDate.format(DateTimeFormatter.ofPattern("MMM/dd/yyyy")));
		
		
		LocalDate anotherDate=LocalDate.parse("1995-02-12");
		System.out.println(anotherDate);
		
		boolean output = someDate.isAfter(anotherDate);
		
		System.out.println(output);
		
		
		LocalTime currentTime = LocalTime.now();
		
		System.out.println(currentTime.format(DateTimeFormatter.ofPattern("hh:mm")));
		
		
		LocalDateTime currentDateTime= LocalDateTime.now();
		
		System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-hh:mm")));
		

	}

}
