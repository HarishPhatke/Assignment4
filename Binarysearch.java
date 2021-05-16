/*Write a program to search for a number in an array using 
binary search.*/

package com.demo.assignment4;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		int n, i, mid, k;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		n = s.nextInt();
		int low = 0, high = n - 1;
		int[] a = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("enter the number you want to search");
		k = s.nextInt();
		while (low <= high) {
			mid = (low + high) / 2;
			if (k < a[mid]) {
				high = mid - 1;
			} else if (k > a[mid]) {
				low = mid + 1;
			} else if (k == a[mid]) {
				System.out.println("number is present");
				break;
			} else {
				System.out.println("number is not present");
			}
		}
	}

}
