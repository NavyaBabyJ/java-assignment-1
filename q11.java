package com.nissan.app;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		int a,sum=0,r=0,n=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		a=input.nextInt();
		while(a>0)
		{
			r=a%10;
			sum=sum*10+r;
			a=a/10;
		}
		System.out.println("Sum of digits= "+sum);

	}

}
