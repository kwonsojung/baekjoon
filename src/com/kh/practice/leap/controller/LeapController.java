package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		boolean result = false;
		result = new GregorianCalendar().isLeapYear(year);
		return result;
	}
	public long leapDate(Calendar c) {
		long result = 0;
		
		return result;
	}

}
