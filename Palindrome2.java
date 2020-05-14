package javaPrograms;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter the String");
		
		Scanner input = new Scanner(System.in);
		str =input.nextLine();
		
		
		String pal = new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(pal))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
		
		
	}

}
