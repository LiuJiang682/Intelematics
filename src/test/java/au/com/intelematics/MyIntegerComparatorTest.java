package au.com.intelematics;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for MyIntegerComparator
 *
 */
public class MyIntegerComparatorTest {

	/**
	 * Given the first object count is 1 and second object count is 2
	 * When the compare method called
	 * Then -1 should return
	 */
	@Test
	public void whenO1Is1NO2Is2ThenNegativeOneShouldReturn() {
		//Given 2 objects
		MyInteger o1 = new MyInteger(1);
		MyInteger o2 = new MyInteger(2);
		o2.increament();
		MyIntegerComparator comparator = new MyIntegerComparator();
		//When the compare method called
		int result = comparator.compare(o1, o2);
		//Then -1 should return
		assertTrue(-1 == result);
	}
	
	/**
	 * Given the first object count is 2 and second object count is 1
	 * When the compare method called
	 * Then 1 should return
	 */
	@Test
	public void whenO2Is1NO1Is2ThenOneShouldReturn() {
		//Given 2 objects
		MyInteger o1 = new MyInteger(1);
		MyInteger o2 = new MyInteger(2);
		o2.increament();
		MyIntegerComparator comparator = new MyIntegerComparator();
		//When the compare method called
		int result = comparator.compare(o2, o1);
		//Then 1 should return
		assertTrue(1 == result);
	}
	
	/**
	 * Given the first object count is 1 and second object count is 1
	 * When the compare method called
	 * Then 0 should return
	 */
	@Test
	public void whenO2Is1NO1IsThenZeroShouldReturn() {
		//Given 2 objects
		MyInteger o1 = new MyInteger(1);
		MyInteger o2 = new MyInteger(2);
		MyIntegerComparator comparator = new MyIntegerComparator();
		//When the compare method called
		int result = comparator.compare(o2, o1);
		//Then 1 should return
		assertTrue(0 == result);
	}
}
