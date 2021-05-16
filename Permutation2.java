//Write a program that will output all possible permutations and combinations of an inputted string.

package com.demo.assignment4;

import java.util.Scanner;

public class Permutation2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.nextLine();
		int n = str.length();
		Permutation2 permutation = new Permutation2();
		permutation.permute(str, 0, n - 1);

	}

	private void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);

	}
}
