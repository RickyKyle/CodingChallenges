package interviewprep;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(stringReverser("Let's talk backwards!"));
		System.out.println(stringReverserWithSB("This works too."));
	}

	/*
	 * Reverses a given string using a for loop. 
	 */
	public static String stringReverser(String stringToReverse) {

		String reversedString = "";

		for (int stringPosition = stringToReverse.length() - 1; stringPosition >= 0; stringPosition--) {
			reversedString += stringToReverse.charAt(stringPosition);
		}

		return reversedString;
	}

	/*
	 * Reverses a given string using the StringBuilder class.
	 */
	public static String stringReverserWithSB(String stringToReverse) {

		StringBuilder stringBuilder = new StringBuilder(stringToReverse);
		return stringBuilder.reverse().toString();
	}

}
