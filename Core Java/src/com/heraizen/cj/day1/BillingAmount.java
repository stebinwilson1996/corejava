package com.heraizen.cj.day1;

import java.util.Scanner;

public class BillingAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the billing amount please:");
		int n = input.nextInt();
		if(n<6000)
		{
			System.out.println("ur net billing amount: "+n);
		}
		else
		{
			int k=n-((n*10)/100);
			System.out.println("ur net billing amount: "+k);
		}
	}

}
