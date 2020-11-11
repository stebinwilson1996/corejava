package com.heraizen.cj.day1;

import java.util.Scanner;

public class Pgm32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int i, j; 
        for(i=0; i<n; i++)
		{			
			for(j=0; j<n; j++)
			{
			if(j==0 || j==n-1 && i!=0  && i!=n/2 || i==0 && j!=n-1 || i==n/2 && j!=n-1      )
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			}
		System.out.println();
		}
     	s.close();
	}
	
	
}
