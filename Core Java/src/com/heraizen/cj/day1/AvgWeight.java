package com.heraizen.cj.day1;

import java.util.Scanner;

public class AvgWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
System.out.println("Enter the weight of person1");
float a=input.nextFloat();
System.out.println("Enter the weight of person2");
float b=input.nextFloat();		
System.out.println("Enter the weight of person3");
float c=input.nextFloat();		
float total=a+b+c;
float avg=total/3;
System.out.println("Weight of 3 person is "+total);
System.out.println("Average Weight of 3 person is "+avg);
input.close();
	}

}
