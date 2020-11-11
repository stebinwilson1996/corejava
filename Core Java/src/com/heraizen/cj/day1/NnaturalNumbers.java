package com.heraizen.cj.day1;

import java.util.Scanner;

public class NnaturalNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers to be generated:");
        int n= s.nextInt();
        for(int i=1;i<=n;i++)
        {
        	System.out.print(i);
        }
     	s.close();
	}

}
