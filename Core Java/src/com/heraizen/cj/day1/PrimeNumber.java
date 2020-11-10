package com.heraizen.cj.day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n= s.nextInt();
        int count =0;
        for(int i=1;i<=n;i++)
        {
        	if(n%i==0)
        	{
        		count++;
        	}
        }
        if(count==2)
        {
        	System.out.println("The entered number is  a prime number");
        }
        else
        {
        	System.out.println("The entered number "+n +" is not a prime number");
        	
        }
	}

}
