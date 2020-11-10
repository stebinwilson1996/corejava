package com.heraizen.cj.day1;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=ip.nextInt();
		System.out.println("Enter second number:");
		int b=ip.nextInt();
		if(a>b)
		{
			System.out.println("The biggest number is "+a);
		}
		else
		{
			System.out.println("The biggest number is "+b);
		}
	}

}
