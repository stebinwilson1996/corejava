package com.heraizen.cj.day1;

import java.util.Scanner;

public class ShoppingMallDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		int bill=scan.nextInt();
		System.out.println("Do you have a membership card?, if it is card is there then press Y,else press N");		
		char card=scan.next().charAt(0);
		int res = membership(bill,card);
		int netamount=bill-res;
		System.out.println("Thank you! Your total bill amount is Rs "+bill+", discount is Rs "+res+" and net amount payable is Rs "+netamount);		
	 	scan.close();
	}
	private static int membership(int bill, char card)
	{
		char a=card;
		
		
		if(a=='y')
		{
			return ((bill*10)/100);
			
		}
		else
		{
			return ((bill*3)/100);
		}
	}

}
