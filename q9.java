package com.nissan.app;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		double sal,total;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		sal=input.nextDouble();
		total=sal*0.4+sal*0.2;
		System.out.println("Total salary:"+total);

	}

}
