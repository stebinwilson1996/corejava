package com.heraizen.cj.day1;
import java.util.Scanner;

public class Numpattern {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int i, j;  
		int c=1;
		
        for(i=0; i<n; i++)
		{
			
			for(j=0; j<n-i; j++) 
               
			{
					System.out.print(c++ +" ");
				
			}
			System.out.println();
		}


	}
}
