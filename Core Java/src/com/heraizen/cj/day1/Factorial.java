package com.heraizen.cj.day1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int res=fact(n);
		System.out.println(res);
		
	}
	private static int fact(int n)
	{
	if(n==1)
	{
		return 1;
	}
	else
	{
		return n*fact(n-1);
	}
	}
}
