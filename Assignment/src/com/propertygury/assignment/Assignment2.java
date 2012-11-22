package com.propertygury.assignment;


/**
 * @author Peter HO
 * @version 1.0
 * The Assignment2 class handles the "Bazz" if the "Fizz"/"Buzz" shown consecutively.
 */
public class Assignment2 {

	private static final String BAZZ = "Bazz";
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZ_BUZZ = FIZZ + BUZZ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printInteger(4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 47, 48, 49, 50, 51, 52);
	}
	
	public static String printInteger(int... arrays) {
		if (arrays == null) {
			//throw new RuntimeException("");
			return "";
		}
		StringBuilder builder = new StringBuilder();
		boolean foundFizz = false;
		boolean foundBuzz = false;
		for (int value : arrays) {
			//Invalid input
			if (value < 0) {
				//throw new RuntimeException("Do not accept the negative value.");
				return "";
			}
			if (value % 3 == 0 && value % 5 == 0) {
				builder.append(FIZZ_BUZZ);
				foundFizz = false;
				foundBuzz = false;
			}
			else if (value % 3 == 0) {
				builder.append(FIZZ);
				foundFizz = true;
			}
			else if (value % 5 == 0) {
				builder.append(BUZZ);
				foundBuzz = true;
			}
			else {			
				if (foundFizz && foundBuzz) {
					builder.append(BAZZ);
				}
				else {
					builder.append(value);
				}
				foundFizz = false;
				foundBuzz = false;
			}
			builder.append(" ");
		}
		
		return builder.toString().trim();
	}

}
