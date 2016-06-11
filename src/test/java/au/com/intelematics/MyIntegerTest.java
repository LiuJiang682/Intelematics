package au.com.intelematics;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for MyInteger class
 */
public class MyIntegerTest {

	//Given an integer
	//When the constructor called
	//Then all properties should initialize
	@Test
	public void whenIntegerProvidedThenAllPropertiesShouldInitialiazed() {
		int integer = 1;
		MyInteger myInteger = new MyInteger(integer);
		assertNotNull(myInteger);
		assertTrue(1 == myInteger.getKey());
		assertTrue(1 == myInteger.getCount());
	}
}
