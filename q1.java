package com.nissan.app;

import java.util.Scanner;

/*Implement a logic to swap two numbers without using a temporary variable.*/
public class q1 {

	public static void main(String[] args) {
		double a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number and second number: ");
		a=input.nextDouble();
		b=input.nextDouble();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: "+a+" " +b);
	}

}
