package com.bridgelabz.binarysearchfromfile;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import com.bridgelabz.utility.Utility;

public class BinarySearchFromFile {
	public static void main(String[] args) throws Exception {
		
		try {
			File f = new File("/home/admin1/Aniket/labz.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String[] words =null;
			String s ;
			String input ="dhoni";
			int count=0;
			while((s = br.readLine())!= null){
				words = s.split(",");
				count= Utility.binarySearchString(words, input);
				if(count==-1) {
					System.out.println("Name not present");
				}
				else
					System.out.println("Name already present in file");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
