package au.com.intelematics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;
import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

/**
 * In order to find out the sum of the most common 
 * integer, as an Intelematics operator,
 * I want to call the IntegerStatistics class
 * and receive the sum of the most common integer
 * with any given array.
 *
 */
public class IntegerStatisticsTest {

	/**
	 * Given an array of integer
	 * When I call findMostCommonInteger method 
	 *   at IntegerStatistics class
	 * Then the integer and number of occur should 
	 * 	 return
	 */
	@Test
	public void whenAnArrayProvidedThenTheIntegerAndNumberOfOccurShouldReturn() {
		//Given an array of integers
		Integer[] array = getAnIntegerArray();
		//When findMostCommonInteger method called
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
		//Then the most common integer and the occurs should return
		assertNotNull(integerAndOccurs);
		assertTrue(integerAndOccurs.isPresent());
		Integer[] entry = integerAndOccurs.get();
		assertTrue(2 == entry.length);
		assertTrue(8 == entry[0]);
		assertTrue(3 == entry[1]);
	}
	
	/**
	 * Given an array of one integer
	 * When I call findMostCommonInteger method 
	 *   at IntegerStatistics class
	 * Then the integer and number of occur should 
	 * 	 return
	 */
	@Test
	public void whenAn1ElementArrayProvidedThenTheIntegerAndNumberOfOccurShouldReturnWithTheOnlyElement() {
		//Given an array of 1 integer
		Integer[] array = {6};
		//When findMostCommonInteger method called
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
		//Then the most common integer is the only element and the occurs should be 1.
		assertNotNull(integerAndOccurs);
		assertTrue(integerAndOccurs.isPresent());
		Integer[] entry = integerAndOccurs.get();
		assertTrue(6 == entry[0]);
		assertTrue(1 == entry[1]);
	}
	
	/**
	 * Given an empty array of integer
	 * When I call findMostCommonInteger method 
	 *   at IntegerStatistics class
	 * Then the integer and number of occur should 
	 * 	 return
	 */
	@Test
	public void whenAnEmptyArrayProvidedThenAnEmptyIntegerAndNumberOfOccurShouldReturn() {
		//Given an empty array
		Integer[] array = {};
		//When findMostCommonInteger method called
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
		//Then the most common integer and the occurs should NOT return
		assertNotNull(integerAndOccurs);
		assertFalse(integerAndOccurs.isPresent());
	}
	
	/**
	 * Given a null array of integer
	 * When I call findMostCommonInteger method 
	 *   at IntegerStatistics class
	 * Then the integer and number of occur should 
	 * 	 return
	 */
	@Test
	public void whenANullArrayProvidedThenAnEmptyIntegerAndNumberOfOccurShouldReturn() {
		//Given an null array
		Integer[] array = null;
		//When findMostCommonInteger method called
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
		//Then the most common integer and the occurs should NOT return
		assertNotNull(integerAndOccurs);
		assertFalse(integerAndOccurs.isPresent());
	}
	
	/**
	 * Given an array of integer
	 * When I call findMostCommonInteger method 
	 *   at IntegerStatistics class
	 * Then the integer and number of occur should 
	 * 	 return
	 */
	@Test
	public void whenAnArrayof50ProvidedThenTheIntegerAndNumberOfOccurShouldReturn() {
		//Given an array of 50 integers
		Integer[] array = {10, 11, 48, 31, 18, 46, 8, 25, 9, 23, 43, 23, 31, 25, 7, 48, 4, 20, 9, 24, 16, 1, 42, 2, 49, 48, 37, 10, 8, 28, 14, 24, 8, 49, 18, 29, 26, 13, 43, 26, 8, 42, 33, 47, 9, 13, 46, 4, 21, 26 };
		//When findMostCommonInteger method called
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
		//Then the most common integer and the occurs should return
		assertNotNull(integerAndOccurs);
		assertTrue(integerAndOccurs.isPresent());
		Integer[] entry = integerAndOccurs.get();
		assertTrue(2 == entry.length);
		assertTrue(8 == entry[0]);
		assertTrue(4 == entry[1]);
	}
	
	/**
	 * Given an array of no duplicated integer
	 * When I call findMostCommonInteger method 
	 *   at IntegerStatistics class
	 * Then the empty integer and number of occur 
	 *   should return
	 */
	@Test
	public void whenAnNoDuplicatedElementArrayProvidedThenEmptyIntegerAndNumberOfOccurShouldReturn() {
		//Given an array of no duplicated integers
		Integer[] array = {6, 8, 2, 3, 1};
		//When findMostCommonInteger method called
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
		//Then the most common integer and the occurs should NOT return
		assertNotNull(integerAndOccurs);
		assertFalse(integerAndOccurs.isPresent());
	}
	
	@Test
	public void whenAnArrayProvidedThenTheSumOfMostCommonIntegerShouldReturn() {
		//Given an array of integer
		Integer[] array = getAnIntegerArray();
		//When calculateSumOfMostCommon method called
		Optional<Integer> sum = IntegerStatistics.calculateSumOfMostCommon(array);
		//Then the sum should return
		assertNotNull(sum);
		assertTrue(sum.isPresent());
		assertTrue(24 == sum.get());
	}
	
	/**
	 * Given an array of no duplicated integer
	 * When I call calculateSumOfMostCommon method 
	 *   at IntegerStatistics class
	 * Then the empty sum should return
	 */
	@Test
	public void whenAnNoDuplicatedElementArrayProvidedThenEmptySumShouldReturn() {
		//Given an array of no duplicated integers
		Integer[] array = {6, 8, 2, 3, 1};
		//When findMostCommonInteger method called
		Optional<Integer> integerAndOccurs = IntegerStatistics.calculateSumOfMostCommon(array);
		//Then the most common integer and the occurs should NOT return
		assertNotNull(integerAndOccurs);
		assertFalse(integerAndOccurs.isPresent());
	}
	
	/**
	 * Given an empty array of integer
	 * When I call findMostCommonInteger method 
	 *   at IntegerStatistics class
	 * Then the integer and number of occur should 
	 * 	 return
	 */
	@Test
	public void whenAnEmptyArrayProvidedThenAnEmptySumShouldReturn() {
		//Given an empty array
		Integer[] array = {};
		//When calculateSumOfMostCommon method called
		Optional<Integer> sum = IntegerStatistics.calculateSumOfMostCommon(array);
		//Then the most common integer and the occurs should NOT return
		assertNotNull(sum);
		assertFalse(sum.isPresent());
	}
	
	/**
	 * Given a null array of integer
	 * When I call findMostCommonInteger method 
	 *   at IntegerStatistics class
	 * Then the integer and number of occur should 
	 * 	 return
	 */
	@Test
	public void whenANullArrayProvidedThenAnEmptySumShouldReturn() {
		//Given an null array
		Integer[] array = null;
		//When calculateSumOfMostCommon method called
		Optional<Integer> sum = IntegerStatistics.calculateSumOfMostCommon(array);
		//Then the most common integer and the occurs should NOT return
		assertNotNull(sum);
		assertFalse(sum.isPresent());
	}
	
	private static Integer[] getAnIntegerArray() {
		Integer[] array = {6, 8, 1, 8, 68, 98, 30, 8};
		return array;
	}
	
	@Ignore
	@Test
	public void generateRandomNumber() {
		System.out.print("{");
		Random random = new Random(System.currentTimeMillis());
		int i = 0;
		while (i < 50) {
			System.out.print(random.nextInt(50) + ", ");
			++i;
		}
		System.out.print("}");
	}
}
