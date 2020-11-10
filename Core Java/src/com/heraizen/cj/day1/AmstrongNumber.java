package com.heraizen.cj.day1;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("\n Please Enter any Number: ");
		int n = s.nextInt();
		int temp=n;
		int p, a=0;
		while(n>0)
		{
			p=n%10;
			n=n/10;
			a=a+(p*p*p);
			
		}
		if(temp==a)
		{
			System.out.println("This is Amstrong number");
		}
		else
		{
			System.out.println("This is Not Amstrong number");
		}

	}
}
