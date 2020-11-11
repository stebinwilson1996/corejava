package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfCubeSeries {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
					Scanner s = new Scanner(System.in);
					System.out.println("Enter any number:");
					int n= s.nextInt();
					double res = sum(n);
					System.out.println(res);
					s.close();
					}
					private static double sum(int n)
					{
					if(n<1)
					{
						return 0;						
					}
					else
					{
						return Math.pow(n, -3)+(n-1);
					}				 	
				}
	}



