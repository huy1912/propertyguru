package com.propertygury.assignment;

/**
 * @author Peter HO
 * @version 1.0
 * The Assignment1 class handles the "Fizz"/"Buzz"/"FizzBuzz" shown consecutively.
 */
public class Assignment1 {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZ_BUZZ = FIZZ + BUZZ;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printInteger(12, 13, 14, 15, 16);
	}
	
	public static String printInteger(int... arrays) {
		if (arrays == null) {
			//throw new RuntimeException("");
			return "";
		}
		StringBuilder builder = new StringBuilder();
		for (int value : arrays) {
			//Invalid input
			if (value < 0) {
				//throw new RuntimeException("Do not accept the negative value.");
				return "";
			}
			if (value % 3 == 0 && value % 5 == 0) {
				builder.append(FIZZ_BUZZ);
			}
			else if (value % 3 == 0) {
				builder.append(FIZZ);
			}
			else if (value % 5 == 0) {
				builder.append(BUZZ);
			}
			else {
				builder.append(value);
			}
			builder.append(" ");
		}
		
		return builder.toString().trim();
	}

}
