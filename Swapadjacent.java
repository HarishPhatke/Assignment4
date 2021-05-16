//Write a program to swap alternate elements in an array.

package com.demo.assignment4;

import java.util.Scanner;

public class Swapadjacent {

	public static void main(String[] args) {
		int i, n, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want to print");
		n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements");
		for (i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for (i = 0; i < n; i += 2) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
