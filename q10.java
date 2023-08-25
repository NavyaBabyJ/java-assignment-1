package com.nissan.app;

import java.util.Scanner;

// If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits.
public class q10 {

	public static void main(String[] args) {
		int a,sum=0,d=0,n=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		a=input.nextInt();
		while(a>0)
		{
			d=a%10;
			sum=sum+d;
			a=a/10;
		}
		System.out.println("Sum of digits= "+sum);
	}
}
