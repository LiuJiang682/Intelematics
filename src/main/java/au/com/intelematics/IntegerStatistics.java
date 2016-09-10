package au.com.intelematics;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang3.ArrayUtils;

/**
 * This is an utility class performs statistics functions
 * for integer.
 *
 */
public class IntegerStatistics {

	private static final int ONE = 1;
	private static final int ZERO = 0;

	/**
	 * This method find out the most common integer in any given integer array.
	 * 
	 * It has a hash map object to keep tracking the occurs of integers and has
	 * the reference of the current most common integer and occurs number. Once
	 * one iteration over the array has completed, it can returns the most common 
	 * integer and its occurs. Thus, this method has O(n) time complexity. However,
	 * since it requires the hash map to keep track the integer, it has O(n) space 
	 * complexity.   
	 *  
	 * @param array The array to find out the common integer
	 * @return 
	 * 		the most common integer
	 * 		the number of occur in the array passed in
	 */
	public static Optional<Integer[]> findMostCommonInteger(Integer[] array) {
		Optional<Integer[]> result = Optional.empty();
		
		if (ArrayUtils.isNotEmpty(array)) {
			Map<Integer, Integer> integerCounters = new HashMap<>();
			Integer theMostCommon = null;
			Integer numOfOccur = ZERO;
			for(Integer integer : array) {
				Integer count = integerCounters.get(integer);
				count = (null == count) ? ONE : ++count;
				integerCounters.put(integer, count);
				if (numOfOccur < count) {
					theMostCommon = integer;
					numOfOccur = count;
				}
			}
			
			// Only set up the Optional if the number of occur is greater than 1
			// or the array only has 1 element.
			if ((ONE < numOfOccur) || (ONE == array.length)) {
				Integer[] integerAndOccurs = {theMostCommon, numOfOccur};
				result = Optional.of(integerAndOccurs);
			}
		}
		return result;
	}

}
