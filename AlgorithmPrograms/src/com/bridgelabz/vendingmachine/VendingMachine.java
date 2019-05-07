package com.bridgelabz.vendingmachine;

public class VendingMachine {
	public static void vendingMachine() {
		int num = 14250, choice = 0;
		int notes;
		if(num<=0) {
			System.out.println("Please enter amount greater than 0");
		}
		while(num!=0) {
			if(num>=1000)
				choice =1;
			else if(num>=500)
				choice =2;
			else if(num>=100)
				choice=3;
			else if(num>=50)
				choice=4;
			else if(num>=20)
				choice=5;
			else if(num>=10)
				choice=6;
			else if(num>=5)
				choice=7;
			else if(num>=2)
				choice=8;
			else if(num>=1)
				choice=9;
			
			switch (choice) {
			case 1: notes =num/1000;
			System.out.println(notes+ " notes of 1000 RS");
			num =num%1000;
				break;
				
			case 2:notes =num/500;
			System.out.println(notes+ " notes of 500 RS");
			num =num%500;
				break;
				
			case 3:notes =num/100;
			System.out.println(notes+ " notes of 100 RS");
			num =num%100;
				break;
				
			case 4:notes =num/50;
			System.out.println(notes+ " notes of 50 RS");
			num =num%50;
				break;
			case 5:notes =num/10;
			System.out.println(notes+ " notes of 10 RS");
			num =num%10;
				break;
				
			case 6:notes =num/20;
			System.out.println(notes+ " notes of 20 RS");
			num =num%20;
				break;
				
			case 7:notes =num/5;
			System.out.println(notes+ " notes of 5 RS");
			num=num%5;
				break;
				
			case 8:notes =num/2;
			System.out.println(notes+ " notes of 2 RS");
			num =num%2;
				break;
				
			case 9:notes =num/1;
			System.out.println(notes+ " notes of 1 RS");
			num =num%1;
				break;
				
			default:
				break;
			}
		}
	}
	public static void main(String[] args) {
		vendingMachine();
	}

}
