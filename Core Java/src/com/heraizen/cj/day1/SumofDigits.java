package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("\n Please Enter any Number: ");
		int n = s.nextInt();
		int m, sum=0;
		while(n>0)
		{
			m=n%10;
			sum=sum+m;
			n=n/10;
			
		}
		System.out.println(sum);

	}
}
