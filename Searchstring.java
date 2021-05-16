//	Write a program that searches for a string in an array of strings 
//(use sequential search).

package com.demo.assignment4;

import java.util.Scanner;

public class Searchstring {

	public static void main(String[] args) {
		int i, n, num;
		char c = 0, z;
		boolean isFound = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of strings you want to add");
		n = s.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter the String");
		for (i = 0; i < n; i++) {
			arr[i] = s.next();
		}
		System.out.println("Enter the string you want to search in an array");
		String searchString = s.next();
		for (i = 0; i < n; i++) {
			if (searchString.equals(arr[i])) {
				System.out.println("String is present");
				isFound = true;
			}
		}
		if (!isFound) {
			System.out.println("String is not present");
		}

	}

}
