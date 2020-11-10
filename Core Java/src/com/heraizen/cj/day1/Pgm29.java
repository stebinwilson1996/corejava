package com.heraizen.cj.day1;

import java.util.Scanner;

public class Pgm29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int i, j;  
		
        for(i=1; i<=n; i++)
		{
			
			for(j=1; j<=i; j++) 
               
			{
					System.out.print(j +" ");
				
			}
			System.out.println();
		}

	}
}
