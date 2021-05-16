//Write a program to find the sum of all the elements in an array.

package com.demo.assignment4;

import java.util.Scanner;

public class Arrayaddition {

	public static void main(String[] args) {
		int i, j, sum = 0, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The sum of array element is equal to" + sum);
	}

}
