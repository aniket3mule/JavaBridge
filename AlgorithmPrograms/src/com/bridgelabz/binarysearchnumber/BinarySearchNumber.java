package com.bridgelabz.binarysearchnumber;

import com.bridgelabz.utility.Utility;

public class BinarySearchNumber {
	
	public static void main(String[] args) {
		
	int arr[] = { 10, 20, 30, 40, 50,70,90};
	
	int r= arr.length-1;
	int ele= 50;
	int l=0;
	
	int res = Utility.binarySearchNumber(arr, l, r, ele);
	
	if(res == -1) {
		System.out.println("element not present in array");
	}
	else {
		System.out.println("element present at index " +res);
	}
	}
}

