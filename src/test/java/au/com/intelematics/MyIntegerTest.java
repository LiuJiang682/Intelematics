package au.com.intelematics;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for MyInteger class
 */
public class MyIntegerTest {

	// Given an integer
	// When the constructor called
	// Then all properties should initialize
	@Test
	public void whenIntegerProvidedThenAllPropertiesShouldInitialiazed() {
		MyInteger myInteger = givenMyInteger();
		assertNotNull(myInteger);
		assertTrue(1 == myInteger.getKey());
		assertTrue(1 == myInteger.getCount());
	}

	// Given an integer
	// When the constructor called
	// Then hashCode should be same as the key
	@Test
	public void whenIntegerProvidedThenHashCodeShouldBeSameAsKey() {
		MyInteger myInteger = givenMyInteger();
		assertNotNull(myInteger);
		assertTrue(1 == myInteger.getKey());
		assertTrue(1 == myInteger.hashCode());
	}

	// Given 2 integers with different count,
	// When the equals method call
	// Then true should be return
	@Test
	public void when2IntegerProvidedThenShouldBeSame() {
		MyInteger myInteger = givenMyInteger();
		assertNotNull(myInteger);
		MyInteger myInteger1 = givenMyInteger();
		myInteger1.increament();
		assertTrue(myInteger.equals(myInteger1));
	}

	/**
	 * Given a MyInteger object When increment method called Then the count will
	 * increase by 1
	 */
	@Test
	public void whenIncrementCalledThenCountIncreaseBy1() {
		// Give a MyIntegerObject
		MyInteger myInteger = givenMyInteger();
		assertTrue(1 == myInteger.getCount());
		// When the increment method called
		myInteger.increament();
		// Then the count increase by 1
		assertTrue(2 == myInteger.getCount());
	}

	private MyInteger givenMyInteger() {
		int integer = 1;
		MyInteger myInteger = new MyInteger(integer);
		return myInteger;
	}
}
