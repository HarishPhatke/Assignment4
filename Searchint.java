//Write a program that searches for an int an array of int's
//(use sequential search).

package com.demo.assignment4;

import java.util.Scanner;

public class Searchint {

	public static void main(String[] args) {
		int i, n, num;
		boolean isFound = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add");
		n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the int you want to search in an array");
		num = s.nextInt();
		for (i = 0; i < n; i++) {
			if (arr[i] == num) {
				System.out.println("Entered number" + num + "is present in an array");
				isFound = true;
			}
		}
		if (!isFound) {
			System.out.println("The number that you entered is not found in array.");
		}
	}

}
