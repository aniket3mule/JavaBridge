package com.bridgelabz.temperaturconversion;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperaturConversion {
	public static void main(String[] args) {
		int ch;
		double temp;
		System.out.println("1: Celsius to Fahrenheit");
		System.out.println("2: Fahrenheit to Celsius");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("Enter celsius temperatur");
			temp = sc.nextDouble();
			System.out.println("Temperatur in fahrenheit is : "+Utility.celsiusTFahrenteit(temp));
			break;
		
		case 2:
			System.out.println("Enter Fahrenheit temperatur");
			temp = sc.nextDouble();
			System.out.println("Temperatur in fahrenheit is : "+Utility.fahrenheitTCelsius(temp));
			break;
		
		default:
			break;
		}
	}

}
