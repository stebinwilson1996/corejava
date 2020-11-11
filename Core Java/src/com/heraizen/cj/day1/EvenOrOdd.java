package com.heraizen.cj.day1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=ip.nextInt();
		if(n%2==0)
		{
			System.out.println("The entered number "+n+" is even");
		}
		else
		{
			System.out.println("The entered number "+n+" is odd");
		}
		ip.close();
	}

}
