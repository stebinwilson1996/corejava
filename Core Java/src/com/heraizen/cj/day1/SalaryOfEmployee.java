package com.heraizen.cj.day1;

import java.util.Scanner;

public class SalaryOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter ur name");
		Scanner input=new Scanner(System.in);
		String name= input.next();
		System.out.println("Enter ur Emp number");
		int empno= input.nextInt();
		System.out.println("Enter ur monthly Salryr");
		float salary= input.nextFloat();
		float sumOfSalary=salary*12;
		System.out.println("Hi "+name+"("+empno+")"+", ur monthy salary is "+salary+" and annual income is "+sumOfSalary);
	 	input.close();
	}
}
