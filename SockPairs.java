package interviewprep;

import java.util.Arrays;

public class SockPairs {

	public static void main(String[] args) {

		int[] sockArray = { 1, 2, 5, 6, 7, 7, 9, 2, 1 };
		System.out.println(sockMerchant(sockArray));

	}

	/*
	 * Given an array of integers, where each integer represents a sock colour, this
	 * method will output the total complete pairs of socks in the array.
	 */
	static int sockMerchant(int[] sockArray) {

		int totalPairs = 0;
		Arrays.sort(sockArray);

		for (int arrayPosition = 0; arrayPosition < sockArray.length; arrayPosition++) {

			if (arrayPosition != (sockArray.length - 1)) {
				if (sockArray[arrayPosition] == sockArray[arrayPosition + 1]) {
					totalPairs++;
					arrayPosition++;
				}

			}

		}

		return totalPairs;

	}
}
