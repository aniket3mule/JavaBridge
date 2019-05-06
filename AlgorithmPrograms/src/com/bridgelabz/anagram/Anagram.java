package com.bridgelabz.anagram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		String str1= "", str2="";
		boolean an = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		str1= sc.nextLine();
		System.out.println("Enter string to find anagram");
		str2= sc.nextLine();
		
		if(str1.length()==str2.length()) {
			if (Utility.anagram(str1, str2)) {
				System.out.println("String is Anagram");
			}
			else {
				System.out.println("String is not anagram");
			}
		}
		else
			System.out.println("String length not matched");
	}

}
