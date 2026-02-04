package com.service;

public class LeaveDaysCalc {
	
	public int calculateLeaveDays(String startDate, String endDate) {
	    // Simple date format for parsing the input date strings
	    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
	    try {
	        // Parse the start and end dates
	        java.util.Date start = sdf.parse(startDate);
	        java.util.Date end = sdf.parse(endDate);
	        
	        // Calculate the difference in milliseconds
	        long diffInMillies = end.getTime() - start.getTime();
	        
	        // Convert milliseconds to days
	        int days = (int) (diffInMillies / (1000 * 60 * 60 * 24)) + 1; // +1 to include both start and end date
	        
	        return days;
	    } catch (java.text.ParseException e) {
	        e.printStackTrace();
	        return 0; // Return 0 in case of an error
	    }
	}

}
