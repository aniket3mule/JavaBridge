package com.bridgelabz.powerof2;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		num = sc.nextInt();
		if((num>0) && (num <= 31)) {
			powerFuction(num);
		}
		else {
			System.out.println("Please enter number greater than 0 or less than 31");
		}
	}

	private static void powerFuction(int num) {
		// TODO Auto-generated method stub
		int sum= 1;
		for(int i = 0; i < num; i++) {
			sum *= 2 ;
		}
		System.out.println("Power of 2^"+num+ " is " +sum);
	}

}
