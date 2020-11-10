package com.heraizen.cj.day1;

import java.util.Scanner;

public class OnlyPositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive or negtive integer:");
		int n = in.nextInt();
		if(n<0) {
		
		System.out.println("number is:"+-(n));
		}
		if(n>0) {
			System.out.println("number is:"+n);
			}
		if(n==0) {
			System.out.println("number iss:"+n);
			}
		
		
	}

}
