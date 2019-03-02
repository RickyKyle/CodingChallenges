package interviewprep;

import java.util.Scanner;

public class RecursivePalindromeChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word you want to check: ");
		String word = scanner.nextLine();
		word = word.toLowerCase();
		scanner.close();

		if (palindromeCheck(word) == true) {
			System.out.println("Yes, it's a palindrome.");
		} else {
			System.out.println("No, it is NOT a plaindrome.");
		}

	}

	public static boolean palindromeCheck(String word) {

		if (word.length() == 0 || word.length() == 1) {
			// If the word has no characters or one, returns true.
			return true;
		} else if (word.charAt(0) == word.charAt(word.length() - 1)) {
			// If the characters at the start and end position of the String
			// match, call method again but with the first and last characters
			// removed.
			return palindromeCheck(word.substring(1, word.length() - 1));

		} else {
			// If the previous conditions aren't met, it's not a palindrome so:
			return false;
		}

	}

}
