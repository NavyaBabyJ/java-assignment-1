package com.nissan.app;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,temp;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number and second number: ");
		a=input.nextDouble();
		b=input.nextDouble();
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: "+a+" " +b);
	}

}
