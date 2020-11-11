package com.heraizen.cj.day1;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to generate its multiplication table:");
		int n = s.nextInt();

		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
		s.close();
		

	}
}
