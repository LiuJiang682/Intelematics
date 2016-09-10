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
		Integer[] array = {6, 8, 1, 8, 68, 98, 30, 8};
		
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
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
		Integer[] array = {6};
		
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
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
		Integer[] array = {};
		
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
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
		Integer[] array = null;
		
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
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
		Integer[] array = {10, 11, 48, 31, 18, 46, 8, 25, 9, 23, 43, 23, 31, 25, 7, 48, 4, 20, 9, 24, 16, 1, 42, 2, 49, 48, 37, 10, 8, 28, 14, 24, 8, 49, 18, 29, 26, 13, 43, 26, 8, 42, 33, 47, 9, 13, 46, 4, 21, 26 };
		
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
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
	 * Then the first integer and number of occur should 
	 * 	 return
	 */
	@Test
	public void whenAnNoDuplicatedElementArrayProvidedThenEmptyIntegerAndNumberOfOccurShouldReturn() {
		Integer[] array = {6, 8, 2, 3, 1};
		
		Optional<Integer[]> integerAndOccurs = IntegerStatistics.findMostCommonInteger(array);
		assertNotNull(integerAndOccurs);
		assertFalse(integerAndOccurs.isPresent());
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
