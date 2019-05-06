package com.bridgelabz.palindromeanagram;

import java.util.Scanner;

public class PalindromeAnagram {
	public static void main(String[] args) {
			anagramPrimeNumbers();
	}
	
	public static void  anagramPrimeNumbers() {
		int i=2, k=0;
		
		int arr[] = new int[500] ;
		while(i<1000) {
			if(i==2) {
				arr[k]=i;
				System.out.println(i+" ");
				k++;
				i++;
				
			}
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					break;
					
				}
				if(j==(i-1)) {
					arr[k]=i;
					if(i==palindrome(i)) {
						System.out.println(palindrome(i));	
					}
					k++;
					
				}
			}
			i++;
		}		
	}

	private static int palindrome(int i) {
		// TODO Auto-generated method stub
		int n = i, r=0, sum=0;
		
		while(n>0) {
			r = n%10;
			sum =( sum*10 )+ r;
			n = n/10;
		}
		return sum;
	}
	

}
