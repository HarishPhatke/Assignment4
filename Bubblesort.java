//Write a program to implement bubble sort.

package com.demo.assignment4;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		int i, j, n, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0; i <= n - 1; i++) {
			System.out.println(a[i]);
		}

	}

}
