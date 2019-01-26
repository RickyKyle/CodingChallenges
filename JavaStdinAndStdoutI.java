package challenges;

import java.util.*;

/*
 * In this challenge, you must read integers from stdin and then print them to 
 * stdout. Each integer must be printed on a new line. To make the problem a 
 * little easier, a portion of the code is provided for you in the editor.
 */

public class JavaStdinAndStdoutI {

	public static void main(String[] args) {

		// Instantiate scanner class.
		Scanner scan = new Scanner(System.in);

		// Capture user input and assign to 3 int variables.
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		// Output user input.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		scan.close();
	}
}
