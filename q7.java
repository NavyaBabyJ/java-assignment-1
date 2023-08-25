package com.nissan.app;

import java.util.Scanner;

//The distance between two cities (KM) is input through the keyboard. 
//Write a program to convert and print this distance in meters, feet, inches and centimeters.
public class q7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the distance in km: ");
		int a=Integer.parseInt(scanner.nextLine());
		System.out.println("Distance in meters= "+a*1000);
		System.out.println("Distance in feet= "+a*3280);
		System.out.println("Distance in inches= "+a*39370);
		System.out.println("Distance in centimeters= "+a*1000*100);
	}

}
