package com.bridgelabz.leapyear;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check leap year");
		year = sc.nextInt();
		check(year);
		if(isLeapYear(year)) {
			System.out.println(year+" is Leap Year");
		}
		else {
			System.out.println(year+" is Not Leap Year");
		}
	}

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)   )
			return true;
		else
			return false;
	}

	private static void check(int year) {
		// TODO Auto-generated method stub
		int count = 0;
		while (year != 0) {
			year /=10;
			count++;
		}
		if (count != 4) {
			System.out.println("Please enter year with 4 digit only");
			System.exit(0);
		}
	}
}
