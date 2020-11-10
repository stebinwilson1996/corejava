package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		System.out.print(1+" ");
		float sum=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum+1/i;
		}
		System.out.print("sum is"+ sum);
	}
}
