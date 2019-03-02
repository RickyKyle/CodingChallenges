package interviewprep;

public class SimpleArraySum {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3};
		
		System.out.println(simpleArraySum(intArray));

	}

	/*
	 * Returns the total sum of the values in a given array.
	 */
	public static int simpleArraySum(int[] intArray) {

		int sum = 0; 
		
		for (int element : intArray) {
			sum += element; 
		}
		
		return sum; 

	}

}
