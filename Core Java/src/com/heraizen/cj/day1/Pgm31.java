package com.heraizen.cj.day1;

import java.util.Scanner;

public class Pgm31 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int i, j;  
		int a=1;
		for(i=1; i<=n; i++)
		{
			for(j=1; j<=n; j++)                
			{
				System.out.print(19*(a++) +" ");
			}
			System.out.println();
		}
	 	s.close();
	}
}
