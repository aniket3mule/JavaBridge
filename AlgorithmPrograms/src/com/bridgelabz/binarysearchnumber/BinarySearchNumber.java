package com.bridgelabz.binarysearchnumber;

import com.bridgelabz.utility.Utility;

public class BinarySearchNumber {
	
	public static void main(String[] args) {
		
		int ele= 80;
		int arr[] = {2,3,1,10,58,40};
		int res = Utility.binarySearchNumber(arr, ele);
		if(res == -1) {
			System.out.println("element not present in array");
		}
		else {
			System.out.println("element present at index " +res);
		}
	}
}

