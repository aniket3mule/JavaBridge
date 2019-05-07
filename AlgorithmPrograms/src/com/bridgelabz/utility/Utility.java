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
	
	public static int binarySearchNumber(int[] arr, int ele) {
		int mid=0, start =0, end = arr.length-1;
		int arr1[] = insertionSortNew(arr);
		for (int i : arr1) {
			System.out.println(i);
		}
		while(start<=end) {
			mid =(start+end)/2;
			
			if(arr1[mid]==ele) {
				return mid;
			}
			
			if(arr1[mid]<ele) {
				start = mid+1;
			}
			else if(arr1[mid]>ele) {
				end = mid-1;
			}
		}
		return -1;
	}
	
	
	
	
	//binarySearch method for String
	public static int binarySearchString(String[] arr, String ele) {
		int mid=0, start =0, end = arr.length-1;
		String arr1[] = insertionSortNewString(arr);
		while(start<=end) {
			mid =(start+end)/2;
			
			if(arr1[mid].compareTo(ele)==0) {
				return mid;
			}
			
			if(arr1[mid].compareTo(ele)<0) {
				start = mid+1;
			}
			else if(arr1[mid].compareTo(ele)>0) {
				end = mid-1;
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
	public static String[] insertionSortString(String[] arr) {
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
		return arr;
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
		public static String[] insertionSortNewString(String[] arr) {
			for(int i=1; i<arr.length; i++) {
				String key = arr[i];
				int j=i-1;
				while(j>=0 && arr[j].compareTo(key)>0) {
					arr[j+1] =arr[j];
					j--;
				}
				arr[j+1]=key;
			}
			return arr;
		}
		
		
		//bubbleSort method for integer
		public static int[] bubbleSortInt(int[] arr) {
			for(int i=1; i<arr.length; i++) {
				for(int j=0; j<arr.length-1; j++) {
					int temp;
					if(arr[j]> arr[j+1]) {
						temp= arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			return arr;
		}
		
		
		//bubbleSort method for String
		public static String[] bubbleSortString(String str[]) {
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j < str.length-1; j++) {
					if (str[j].compareTo(str[j+1])>0) {
						String temp = null;
						temp = str[j];
						str[j]= str[j+1];
						str[j+1]= temp;
					}
				}
			}
			return str;
		}
		
		
		
		public static long Stopatch(long startt, long endt) {
			
			return (endt-startt);
			
		}


		public static double celsiusTFahrenteit(double temp) {
			// TODO Auto-generated method stub
			return ((temp*9/5)+23);
		}


		public static double fahrenheitTCelsius(double temp) {
			// TODO Auto-generated method stub
			return ((temp-32)*5/9);
		}


		public static double monthlyPayment(int y, int p, int r) {
			// TODO Auto-generated method stub
			int n = 12*y;
			int rate = r/(12*100);
			int x= 1+rate;
			return (p*r)/1-(Math.pow(x, -n));
		}


		
		
		
		
		
		
		
		
}