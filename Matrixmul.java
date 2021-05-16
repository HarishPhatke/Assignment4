//Write a program to multiply two matrices.

package com.demo.assignment4;

import java.util.Scanner;

public class Matrixmul {

	public static void main(String[] args) {
		int i, j, k, sum;
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		Scanner s = new Scanner(System.in);
		System.out.println("enter the nine numbers for the first matrix");
		for (i = 0; i <= 2; i++)
			for (j = 0; j <= 2; j++) {
				a[i][j] = s.nextInt();
			}
		System.out.println("enter the nine numbers for the second matrix");
		for (i = 0; i <= 2; i++)
			for (j = 0; j <= 2; j++) {
				b[i][j] = s.nextInt();
			}
		for (i = 0; i <= 2; i++)
			for (j = 0; j <= 2; j++) {
				sum = 0;
				for (k = 0; k <= 2; k++) {
					sum = sum + a[i][k] * b[k][j];
					c[i][j] = sum;
				}
			}
		for (i = 0; i <= 2; i++) {
			for (j = 0; j <= 2; j++) {
				System.out.print(c[i][j]);

			}
			System.out.println(" ");
		}

	}

}
