package com.bridgelabz.couponnumber;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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
		
		Random ran = new Random();
		Set<Integer> l = new HashSet<Integer>(); 
		for(int i=0; i<n+n; i++) {
			l.add(ran.nextInt(n));
	}
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

}
}
