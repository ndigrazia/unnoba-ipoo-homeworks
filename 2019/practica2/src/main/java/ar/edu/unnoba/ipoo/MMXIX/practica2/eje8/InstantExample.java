package ar.edu.unnoba.ipoo.MMXIX.practica2.eje8;

import java.time.Instant;

//An Instant represents a point in time (similar to java.util.Date) with nanoseconds precision
//(unlike the old Date which has milliseconds precision).
//An Instant is a moment on the timeline in UTC, a count of nanoseconds since the epoch of the first moment of 1970 UTC (basically, see class doc for nitty-gritty details)
//Representing a point in time using nanoseconds precision requires more space than a Long can provide, therefore the internal representation is composed of two Long fields, the first holds the number of seconds since (or before) the standard Java epoch and the other the number of nanoseconds of the last seconds (so never larger than 999,999,999). 
public class InstantExample {

	public static void main(String[] args) {
		// Get the current time
		Instant instant = Instant.now();
		
		// Output format is ISO-8601
		System.out.println(instant);	
	}
	
}
