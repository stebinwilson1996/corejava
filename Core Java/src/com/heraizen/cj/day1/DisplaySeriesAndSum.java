package com.heraizen.cj.day1;

import java.util.Scanner;

public class DisplaySeriesAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i=i+2)
		{
			System.out.println(i);
			sum+=i;
		}

		System.out.println("Sum Of Series is "+sum);
		s.close();
	}

}



