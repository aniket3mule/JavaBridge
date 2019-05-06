package com.bridgelabz.stopwatch;

import java.util.Scanner;

/*
 * @author: Aniket Mule
 * @purpose: for measuring the time that elapses between
 *				the start and end clicks
 * 
 * */
public class Stopwatch {
	public static void main(String[] args) {
		long startt = 0, endt = 0;
		int choice;
		startt=start(startt);
		System.out.println("Start is running press 1 to stop");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			endt = stop(endt);
			System.out.println(elapsed(startt, endt ));
			break;

		default:
			break;
		}
	}
	private static long elapsed(long start, long stop) {
		// TODO Auto-generated method stub
		long elapsedtime = stop-start;
		return elapsedtime;
		
		
	}
	
	private static long start(long startt) {
		// TODO Auto-generated method stub
		startt = System.currentTimeMillis();
		System.out.println(startt);
		return startt;
	}
	
	private static long stop(long endt) {
		// TODO Auto-generated method stub
		endt = System.currentTimeMillis();
		return endt;
	}

}
