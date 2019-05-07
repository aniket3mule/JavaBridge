package com.bridgelabz.insertionsort;

public class InsertionSort {
	public static void main(String[] args) {
		String str[] = {"aniket", "shubham", "shrikant", "raina", "dhoni"};
		for (int k = 0; k < str.length; k++) {
			char ch[] = str[k].toCharArray();
			for ( int i = 1; i < ch.length; i++) {
				char key = ch[i];
				int j = i-1;
				while(j>=0 && ch[j]>key) {
					ch[j+1] =ch[j];
					j--;
				}
				ch[j+1]=key;
			}
			for (char c : ch) {
				System.out.print(c);
			}
			System.out.println(" ");
		}
	}
}
