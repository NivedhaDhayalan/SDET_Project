package JAVA;

import java.util.Scanner;

public class PalindromeorNot {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter a string");
				String input = Scanner.nextLine();
				Boolean ispalindrome = true;
				int length = input.length();
				for(int i=0; i<length/2;i++) {
					if(input.charAt(i)!= input.charAt(length-1-i)) {
						ispalindrome = false;
					} }
					if(ispalindrome) {
						System.out.println("given String is a Palindrome");
					}
					else {
						System.out.println("Given String is not a palindrome");
					}
			Scanner.close();	
			}
	}


