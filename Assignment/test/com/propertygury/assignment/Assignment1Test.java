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
 * The junit test class for the Assignment1.
 */
public class Assignment1Test {

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
	 * Test method for {@link com.propertygury.assignment.Assignment1#printInteger(int[])}.
	 */
	@Test
	public void testPrintInteger() {
		assertEquals("Expect empty value!!!", "", Assignment1.printInteger(12, 13, 14, 15, -16));
		assertEquals("Expect same value!!!", "Fizz 13 14 FizzBuzz 16", Assignment1.printInteger(12, 13, 14, 15, 16));
	}

}
