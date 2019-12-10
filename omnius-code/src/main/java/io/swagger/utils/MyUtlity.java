package io.swagger.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;

public class MyUtlity {

	public static DateTime getDateWithoutZone(DateTime date) {
		Date date1 = null;
		date1 = date.toDate();
		Calendar calendar = null;
		calendar = Calendar.getInstance();
		calendar.setTime(date1);
		int offset = calendar.getTimeZone().getOffset(calendar.getTimeInMillis());
		calendar.add(Calendar.MILLISECOND, offset);
		calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
		return new DateTime(calendar);
	}
	
	public static boolean validateStatus(String status)
	{
		boolean valid = false;

		if(status.equalsIgnoreCase("Created") 
				|| status.equalsIgnoreCase("Closed") 
				|| status.equalsIgnoreCase("In-progress")
				|| status.equalsIgnoreCase("Cancelled"))
			valid = true;

		return valid;
	}
}
