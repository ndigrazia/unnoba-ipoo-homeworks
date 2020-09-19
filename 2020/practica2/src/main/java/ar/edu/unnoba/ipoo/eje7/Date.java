package ar.edu.unnoba.ipoo.eje7;

import java.time.*; 
import java.time.format.*; 

//LocalDateTime represents a date and a time-of-day. But lacking a time zone or offset-from-UTC, this class cannot represent a moment. 
//It is a description of the date, as used for birthdays, combined with the local time as seen on a wall clock
//It cannot represent an instant on the time-line without additional information such as an offset or time-zone.
//Legacy class (Lacking)

public class Date {

	  public static void main(String[] args) {
		  
	        LocalTime time_now = LocalTime.now();
	        System.out.println(time_now);
	        
	        LocalDate date_now = LocalDate.now();
	        System.out.println(date_now);
	        
	        LocalDateTime todate = LocalDateTime.of(date_now, time_now);
	        System.out.println(todate);
	        
	        Period period = Period.ofDays(4);
	        System.out.println("period incremented : " + date_now.plus(period));
	        
	        DateTimeFormatter isoDate = DateTimeFormatter.ISO_LOCAL_DATE;
	        System.out.println(todate.format(isoDate));
	      
	        DateTimeFormatter isoTime = DateTimeFormatter.ISO_LOCAL_TIME;
	        System.out.println(todate.format(isoTime));
	        
	        DateTimeFormatter f = DateTimeFormatter.ofPattern("'Its:' h ':' mm");
	        System.out.println(time_now.format(f));
	    }
}
