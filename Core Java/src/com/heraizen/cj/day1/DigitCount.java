package com.heraizen.cj.day1;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number, Count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("\n Please Enter any Number: ");
		Number = s.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);

	}
}
