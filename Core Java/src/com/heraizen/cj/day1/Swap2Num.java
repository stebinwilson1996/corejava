package com.heraizen.cj.day1;

import java.util.Scanner;

public class Swap2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter ur First number");
		Scanner input=new Scanner(System.in);
		int a= input.nextInt();
		System.out.println("Enter ur second number");
		int b= input.nextInt();
		int temp=a;
		a =b;
		b =temp;
		System.out.println("The swapped no are a="+a+" b="+b);
		input.close();
	}

}
