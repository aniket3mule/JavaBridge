package com.bridgelabz.tobinary;

public class ToBinary {
	public static void main(String[] args) {
		int num=5,i=0;
		int res[] = new int[1000];
		while(num>0) {
			res[i] = num%2;
			num = num/2;
			i++;
		}
		for (int j = i-1; j >=0; j--) {
			System.out.print(res[j]);
		}
	}
}
