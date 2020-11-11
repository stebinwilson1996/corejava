package com.heraizen.cj.day1;

import java.util.Scanner;

public class DiffBtwNoOnlyPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number num1:");
		int num1=scan.nextInt();
		System.out.println("Enter the second number num1:");
		int num2=scan.nextInt();
		difference(num1,num2);
		scan.close();
		}
	private static void difference(int num1,int num2)
	{
		
		if(num1>num2)
		{
			System.out.println("The result (difference) is: "+(num1-num2));
		}
		else
		{
			System.out.println("The result (difference) is: "+(num2-num1));
		}
	
	}

	}

