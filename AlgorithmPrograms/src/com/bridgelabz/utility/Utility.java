package com.bridgelabz.utility;

public class Utility {
	
	/*An Anagram Detection Example
	 * @author: Aniket Mule
	 * 
	 * */
	public static boolean anagram(String str1, String str2) {
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		int count=0;
		for(int i=0; i< ch1.length;i++) {
			for(int j=0; j< ch2.length;j++) {
				if(ch1[i]==ch2[j]) {
					count++;
				}
			}
		}
		if(count == ch1.length) {
			return true;
		}
		else
		return false;
	}
	
	
	//Prime Number 0 -1000
	public static int[]  primeNumbers(int[] arr) {
		int i=2, k=0;
		arr = new int[500];
		while(i<1000) {
			if(i==2) {
				arr[k]=i;
				System.out.println(i+" ");
				k++;
				i++;	
			}
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					break;	
				}
				if(j==(i-1)) {
					arr[k]=i;
					System.out.println(i+ " ");
					k++;
				}
			}
			i++;
		}
		return arr;
	}
	
	
	
	
	//binarySearch method for integer
	
	public static int binarySearchNumber(int[] arr, int l, int r, int ele) {
		int mid=0;
		while(l<=r) {
			mid=(l+r)/2;
			if(arr[mid]==ele) {
				return mid;
			}
			else if(arr[mid]>ele) {
				l = mid+1;
				binarySearchNumber( arr,  l,  r,  ele);
			}
			else {
				r = mid+1;
				binarySearchNumber( arr,  l,  r,  ele);
			}
		}
		return -1;
		}
	
	//insertionSort method for integer
	public static void insertionSort(int[] arr) {
		int temp;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}
		}
		for(int i : arr)
		System.out.println(i);
	}
	
	
	//insertionSort method for String
	public static void insertionSortString(String[] arr) {
		String temp=null;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}
		}
		for(String i : arr)
		System.out.println(i);
	}
	
	//insertionSort method for integer
	public static int[] insertionSortNew(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] =arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
	
	//insertionSort method for String
		public static void insertionSortNewString(String[] arr) {
			for(int i=1; i<arr.length; i++) {
				String key = arr[i];
				int j=i-1;
				while(j>=0 && arr[j].compareTo(key)>0) {
					arr[j+1] =arr[j];
					j--;
				}
				arr[j+1]=key;
			}
			for(String i : arr)
			System.out.println(i);
		}
		
		
		//bubbleSort method for integer
		public static int[] bubbleSortInt(int[] arr) {
			for(int i=1; i<arr.length; i++) {
				for(int j=0; j<arr.length-1; j++) {
					int temp;
					if(arr[j]> arr[j+1]) {
						temp= arr[j];
						arr[j]=arr[j+1];
						arr[j-1]=temp;
					}
				}
			}
			return arr;
			
		}


		
		
		
		
		
		
		
		
}