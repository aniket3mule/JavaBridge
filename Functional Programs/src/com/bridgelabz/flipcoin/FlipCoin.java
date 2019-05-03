package com.bridgelabz.flipcoin;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		int fliptimes = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many times you have to flip the coin");
		fliptimes = sc.nextInt();
		flipCoin(fliptimes);
	}

	private static void flipCoin(int fliptimes) {
		// TODO Auto-generated method stub
		float head = 0.0f, tail = 0.0f;
		if(fliptimes <= 0) {
			System.out.println("Please enter positive number");	
			System.exit(0);
		}
		
		else {
			for(int i=0; i<fliptimes; i++) {
				if(Math.random()<0.5)
					head++;
				else
					tail++;
			}
		}
		System.out.println(+head+"Percentage of Head : " +head/fliptimes*100);
		System.out.println(+tail+"Percentage of Head : " +tail/fliptimes*100);
	}
}
