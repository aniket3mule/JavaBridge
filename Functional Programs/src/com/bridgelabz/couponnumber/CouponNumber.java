package com.bridgelabz.couponnumber;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Coupon wants to generate");
		n = sc.nextInt();
		Ran r = new Ran();
		r.randomNumber(n);
	

}
}
class Ran{
	
	public void randomNumber(int n) {
		// TODO Auto-generated method stub
		int arr[] = new int[n];
		Random ran = new Random();
		
		for(int i=0; i<n; i++) {
			arr[i] = ran.nextInt(n);
			
			System.out.println(arr[i]);
	}

}
}
