// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int ones = num % 10;
		int tens = (num / 10) % 10;
		int hundreds = num / 100;
		// For numbers with more than 3 digits like 1234 it outputs number of hundreds in the number, in that case its 12

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
