//Write a program to implement selection sort.

package com.demo.assignment4;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		int i, j, min, temp, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (i = 0; i < n - 1; i++) {
			min = i;
			for (j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
