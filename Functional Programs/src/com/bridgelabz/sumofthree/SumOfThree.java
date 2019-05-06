package com.bridgelabz.sumofthree;

import java.util.Scanner;

public class SumOfThree {
	public static void main(String[] args) {
		int arr[];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter "+n+ "integer numbers");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<n; j++) {
			System.out.print(arr[j]+ " ");
		}
		System.out.println("");
		sumOfThree(arr);
	
	}

	private static void sumOfThree(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for (int k=j+1; k<arr.length; k++) {
					if(arr[i]+arr[j]+arr[k] == 0) {
						System.out.println(arr[i]+" "+arr[j]+ " "+arr[k]);
						count++;
					}
				}
			}
		}
		System.out.println("Number of distict triplets are : "+count);
	}

}
