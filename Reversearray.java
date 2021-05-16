//Write a program to reverse an array in place (do not use a 2nd Array).

package com.demo.assignment4;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		int i,n,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want to print");
		n = s.nextInt();
		int [] arr = new int[n];
		System.out.println("enter the elements");
		for(i=0;i<n;i++)
		{
			arr[i]= s.nextInt();
		}
		
		for(i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
