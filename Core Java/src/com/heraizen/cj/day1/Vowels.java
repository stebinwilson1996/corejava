package com.heraizen.cj.day1;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("\n Please Enter any Character: ");
		char ch =s.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch +" is vowel");
			break;
		default:
			System.out.println(ch +" is consonant");
		}

	}

}
