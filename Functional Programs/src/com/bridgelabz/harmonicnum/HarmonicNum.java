package com.bridgelabz.harmonicnum;

import java.util.Scanner;

public class HarmonicNum {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		num = sc.nextInt();
		harmonic(num);
	}

	private static void harmonic(int num) {
		// TODO Auto-generated method stub
		double sum = 0.0; 
		if(num != 0) {
			for(int i=1; i<=num; i++) {
				sum += 1.0/i;	
			}
		}
		else {
			System.out.println("Enter number greater than 0");
			System.exit(0);
		}
		System.out.println(sum);
		
	}

}
