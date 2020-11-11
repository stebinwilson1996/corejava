package com.heraizen.cj.day1;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  amount:");
		float p= input.nextInt();
		System.out.println("Enter the rate of interest:");
		float r=input.nextFloat();
		System.out.println("Enter the time in years:");
		int t= input.nextInt();
		float SimpleIntrest=((p*t*r)/100);
		System.out.println("Simple interest will be "+SimpleIntrest);
	 	input.close();
	}

}
