package com.bridgelabz.sortingalgorithms;

import com.bridgelabz.utility.Utility;

public class SortingAlgo {
	public static void main(String[] args) {
		int arr[] = { 50, 20,30, 15, 80,17,19};
		String str[] = {"Aniket", "Shubham", "Shrikant", "Raina", "Dhoni"};
		
		/*Calling utility method for Insertion Sort
		 */ 
		Utility.insertionSortNew(arr);
		for(int i : arr)
		System.out.println(i);
		
		Utility.insertionSortNewString(str);
		for (String i : str) {
			System.out.println(i);
		}
		
		//Calling utility method for Bubble Sort 	
		Utility.bubbleSortInt(arr);
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		Utility.bubbleSortString(str);
		for(String i : str)
		{
			System.out.println(i);
		}
	}

}
