package com.heraizen.cj.day1;

import java.util.Scanner;

public class Fibnocii {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1=0,n2=1,n3=0,count=0;
		System.out.print(n1+" "+n2);
		System.out.print("Enter the upper bound number to generate the Fibonacci numbers: "); 
		count = s.nextInt();
		for(int i =2;i<=count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
