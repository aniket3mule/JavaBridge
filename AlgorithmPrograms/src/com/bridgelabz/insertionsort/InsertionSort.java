package com.bridgelabz.insertionsort;

import com.bridgelabz.utility.Utility;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 50, 20,30, 15, 80,17,19};
		Utility.insertionSort(arr);
		String arr1[] = {"Aniket", "Shubham", "Shrikant", "Raina", "Dhoni"};
		Utility.insertionSortString(arr1);
		Utility.insertionSortNew(arr);
		for(int i : arr)
		System.out.println(i);
		Utility.insertionSortNewString(arr1);
	}
}
