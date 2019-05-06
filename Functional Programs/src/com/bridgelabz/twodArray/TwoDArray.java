package com.bridgelabz.twodArray;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][];
		int m=0, n=0;
		System.out.println("Enter rows * col");
		m = sc.nextInt();
		n = sc.nextInt();
		arr = new int[m][n];
		System.out.println("Enter "+m*n+" integer values");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
								
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
	}

}
