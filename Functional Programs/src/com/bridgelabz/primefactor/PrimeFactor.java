package com.bridgelabz.primefactor;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		int num= 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		primeFactor(num);
	}

	private static void primeFactor(int num) {
		// TODO Auto-generated method stub
		while(num%2==0) {
			System.out.println("2"+" ");
			num /=2;
		}
		for(int i=3; i<=Math.sqrt(num); i+=2) {
			while(num%i==0) {
				System.out.println(i+ " ");
				num /= i;
			}
			
		}
	}

}
