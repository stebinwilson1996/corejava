package com.heraizen.cj.day1;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int num =0;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			num+=i;
			num*=10;
			k*=10;
			
		}
		num/=10;
		k/=10;
		for(int i=1;i<=n;i++)
		{
			System.out.println(num);
			num=(num%10)*k+(num/10);
			
		}
		
	}
}
