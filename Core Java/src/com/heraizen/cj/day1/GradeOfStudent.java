package com.heraizen.cj.day1;

import java.util.Scanner;

public class GradeOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks scored in 1st subject:");
        x = s.nextInt();
        System.out.print("Enter the marks scored in 2nd subject:");
        y = s.nextInt();
        System.out.print("Enter the marks scored in 3rd subject:");
        z = s.nextInt();
        int totalmarks=x+y+z;
        float avg=totalmarks/3;
        System.out.println("Total marks: "+totalmarks);
        System.out.println("Average is: "+avg);
        grade(avg);
       }
	
	private static void grade(float avg)
	{
		if(avg<35)
		{
			System.out.println("Grade:"+"C");
			
		}
		else if(avg>35 && avg<60)
		{
			System.out.println("Grade:"+"B");
		}
		else
		{
			System.out.println("Grade:"+"A");
		}
		
	}
}
