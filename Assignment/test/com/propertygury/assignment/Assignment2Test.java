/**
 * 
 */
package com.propertygury.assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Peter Ho
 * @version 1.0
 *
 * The junit test class for the Assignment2.
 */
public class Assignment2Test {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.propertygury.assignment.Assignment2#printInteger(int[])}.
	 */
	@Test
	public void testPrintInteger() {
		
		assertEquals("Expect empty value!!!", "", Assignment2.printInteger(12, 13, 14, 15, -16));
		assertEquals("Expect same value!!!", "4 Buzz Fizz Bazz 8 Fizz Buzz Bazz Fizz", Assignment2.printInteger(4, 5, 6, 7, 8, 9, 10, 11, 12));
		assertEquals("Expect same value!!!", "19 Buzz Fizz Bazz 23", Assignment2.printInteger(19, 20, 21, 22, 23));
	}

}
