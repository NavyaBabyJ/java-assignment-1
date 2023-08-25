package com.nissan.app;

import java.util.Scanner;

public class q7new {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temperature in farenheit: ");
		int f=Integer.parseInt(s.nextLine());
		float c=(float)((f-32)/1.8);
		System.out.println("Temperature in celsius: "+c);
	}

}
