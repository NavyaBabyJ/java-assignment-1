package com.nissan.app;

import java.util.Scanner;

//Read two numbers, divide the first number by the second and print the quotient and remainder.
public class q6 {

	public static void main(String[] args) {
		double a,b,quotient=0,remainder=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number and second number: ");
		a=input.nextDouble();
		b=input.nextDouble();	
		quotient=a/b;
		remainder=a%b;
		System.out.println("Quotient= "+quotient);
		System.out.println("Remainder= "+remainder);
	}

}
