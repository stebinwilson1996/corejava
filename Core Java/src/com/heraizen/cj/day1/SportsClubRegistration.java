package com.heraizen.cj.day1;

import java.util.Scanner;

public class SportsClubRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner op = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=op.next();
		System.out.println("Enter the mobile number:");
		double mobileNo=op.nextDouble();
		System.out.println("Enter the age:");
		int age=op.nextInt();
		if(age<18)
		{
			System.out.println("Sorry! You need to be at least 18 years old to get membership.");
			
		}
		else
		{
			System.out.println("Congratulations "+name+" for your successful registration with the mobile number ."+mobileNo);
		}
	 	op.close();
	}

}
