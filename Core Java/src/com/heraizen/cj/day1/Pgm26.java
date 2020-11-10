package com.heraizen.cj.day1;

import java.util.Scanner;

public class Pgm26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int i, j;  
		int c=1;
        for(i=0; i<n; i++)
		{
			
			for(j=0; j<n; j++) 
               
			{
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}
}
