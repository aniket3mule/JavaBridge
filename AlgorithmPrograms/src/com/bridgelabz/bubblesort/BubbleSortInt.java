package com.bridgelabz.bubblesort;

import com.bridgelabz.utility.Utility;

public class BubbleSortInt {
	public static void main(String[] args) {
		int arr[] = { 50, 20,30, 15, 80,17,19};
		
		Utility.bubbleSortInt(arr);
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		String str[] = { "Suresh", "Dhoni", "Ashwin", "Jadeja", "Harbajan"};
		Utility.bubbleSortString(str);
		for(String i : str)
		{
			System.out.println(i);
		}
			
	}

}
