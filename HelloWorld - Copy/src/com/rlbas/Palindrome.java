package com.rlbas;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		String original, reverse = "";
		System.out.println("Enter a String or number to check palindrome or not..!");
		Scanner sin  = new Scanner(System.in);
		original = sin.next();
		int lenght = original.length();
		for(int i = lenght-1; i>=0;i--) {
			reverse = reverse+original.charAt(i);
			
		}
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println("Entered value is a Palindrome");
		} else {
			System.out.println("Entered values not a Palindrome.");
		}
	}
}
