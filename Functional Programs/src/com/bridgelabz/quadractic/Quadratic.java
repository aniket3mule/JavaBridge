package com.bridgelabz.quadractic;

public class Quadratic {
	public static void main(String[] args) {
		int a=4, b=5, c=7;
		int delta;
		double root1, root2;
		
		delta = b*b-4*a*c;
		root1 = (-b + Math.sqrt(delta))/(2*a);
		root2 = (-b - Math.sqrt(delta))/(2*a);
	}
}
