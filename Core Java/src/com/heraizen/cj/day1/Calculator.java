package com.heraizen.cj.day1;

import java.util.Scanner;

public class Calculator {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st Operand num1: ");
		int m = s.nextInt();
		System.out.println("Enter the 1st Operand num2: ");
		int n = s.nextInt();
		System.out.println("Enter you choice");
		System.out.println("1 sum");
		System.out.println("2:subtract");
		System.out.println("3 multiply");
		System.out.println("4 division");
		
		int choice= s.nextInt();
		switch(choice)
		{
		case 1: System.out.println("sum af "+m+" and "+n+"is :"+ (m+n));
				break;
		case 2: System.out.println("sub af "+m+" and "+n+"is :"+ (m-n));
				break;
		case 3: System.out.println("mul af "+m+" and "+n+"is :"+ (m*n));
				break;
		case 4: System.out.println("div af "+m+" and "+n+"is :"+ (m/n));
				break;
		default:
			System.out.println("Invalid");
				
		}
		
		s.close();

	}

}
