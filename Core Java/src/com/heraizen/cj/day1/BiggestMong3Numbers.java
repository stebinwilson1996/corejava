package com.heraizen.cj.day1;

import java.util.Scanner;

public class BiggestMong3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        biggest(x,y,z);
	}
        private static void biggest(int x,int y,int z)
        {
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
        }

}
