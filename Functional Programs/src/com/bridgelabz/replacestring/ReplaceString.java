package com.bridgelabz.replacestring;
import java.util.Scanner;
public class ReplaceString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "hello <<UserName>>, How are you?";
		System.out.println("Enter Name");
		String str2= sc.next();
		check(str2);
		ReplaceString(str1, str2);
	}
// Replace String method
	private static void ReplaceString(String str1, String str2) {
		// TODO Auto-generated method stub
		str2 = str1.replace("<<UserName>>", str2);
		System.out.println(str2);
	}
// To check the input string
	private static void check(String str2) {
		// TODO Auto-generated method stub
		if(str2.length()<=2) {
			System.out.println("Please Enter User Name with more than 3 characters");
		}
	}

}
