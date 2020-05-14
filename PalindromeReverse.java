package javaPrograms;

import java.util.Scanner;

public class PalindromeReverse {

	public static void main(String[] args) {
		
		String str, pal = "";
		System.out.println("Enter the String");
		
		Scanner input = new Scanner(System.in);
		str =input.nextLine();
		
		int length = str.length();
		
		for (int i = length-1; i>= 0; i--)
		{
			pal = pal+str.charAt(i);
		}
		if (str.equalsIgnoreCase(pal))
		{
			System.out.println("It is a Palindrome");
		}
		
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
