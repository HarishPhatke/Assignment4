/*Write a program where input is two sorted arrays of ints. The data from these arrays needs to be put into a larger array (numbers need to 
be sorted, duplicates are allowed.*/

package com.demo.assignment4;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		int i, j = 0, n, m, z;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size of first array elements");
		n = s.nextInt();
		int[] a = new int[n];

		System.out.println("Enter the size of second array elements");
		m = s.nextInt();
		int[] b = new int[m];

		z = n + m;
		int[] c = new int[z];
		System.out.println("Enter the numbers for first array");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter the numbers for second array");
		for (i = 0; i < m; i++) {
			b[i] = s.nextInt();
		}
		for (i = 0; i < n; i++) {
			c[i] = a[i];
		}
		for (i = n; i < z; i++) {
			c[i] = b[j];
			j++;
		}
		for (i = 0; i < z; i++) {
			System.out.print("{" + c[i] + "}");
		}

	}

}
