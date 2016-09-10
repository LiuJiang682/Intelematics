package au.com.intelematics;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

/**
 * This is an utility class performs statistics functions for integer.
 * 
 */
public class IntegerStatistics {

	private static final int ONE = 1;
	private static final int ZERO = 0;
	private static Random random;

	/**
	 * This method find out the most common integer in any given integer array.
	 * 
	 * It has a hash map object to keep tracking the occurs of integers and has
	 * the reference of the current most common integer and occurs number. Once
	 * one iteration over the array has completed, it can returns the most
	 * common integer and its occurs. Thus, this method has O(n) time
	 * complexity. However, since it requires the hash map to keep track the
	 * integer, it has O(n) space complexity.
	 * 
	 * @param array
	 *            The array to find out the common integer
	 * @return the most common integer the number of occur in the array passed
	 *         in
	 */
	public static Optional<Integer[]> findMostCommonInteger(Integer[] array) {
		Optional<Integer[]> result = Optional.empty();

		if (ArrayUtils.isNotEmpty(array)) {
			Map<Integer, Integer> integerCounters = new HashMap<>();
			Integer theMostCommon = null;
			Integer numOfOccur = ZERO;
			for (Integer integer : array) {
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
				Integer[] integerAndOccurs = { theMostCommon, numOfOccur };
				result = Optional.of(integerAndOccurs);
			}
		}
		return result;
	}

	public static Optional<Integer> calculateSumOfMostCommon(Integer[] array) {
		Optional<Integer> sum = Optional.empty();
		Optional<Integer[]> integerAndOccurs = findMostCommonInteger(array);

		if (integerAndOccurs.isPresent()) {
			Integer[] mostCommonAndOccurs = integerAndOccurs.get();
			System.out.println("Most common Integer: "
					+ mostCommonAndOccurs[ZERO] + ", Occurs: "
					+ mostCommonAndOccurs[ONE]);
			sum = Optional.of(mostCommonAndOccurs[ZERO]
					* mostCommonAndOccurs[ONE]);
		}
		return sum;
	}

	private static Integer[] generateRandomIntegers(final int arraySize,
			final int maxValue) {
		Integer[] randomArray = new Integer[arraySize];
		for (int index = ZERO; index < arraySize; index++) {
			randomArray[index] = random.nextInt(maxValue);
		}
		return randomArray;
	}

	private static void printArray(final Integer[] integerArray) {
		StringBuilder buf = new StringBuilder("[");
		for (int index = ZERO; index < integerArray.length - ONE; index++) {
			buf.append(integerArray[index]);
			buf.append(", ");
		}
		buf.append(integerArray[integerArray.length - ONE]);
		buf.append("]");
		System.out.println(buf.toString());
	}

	private static void usage() {
		System.out
				.println("Usage: java -jar intelematics.jar [arraySize] [maxValue]");
	}

	public static void main(String[] args) {
		random = new Random(System.currentTimeMillis());
		Integer[] integerArray = null;

		try {
			if ((null == args) || (ZERO == args.length)) {
				System.out
						.println("No parameters passed in. Generating a 100 elements array with 20 as max value");
				usage();
				integerArray = generateRandomIntegers(100, 20);
			} else if (ONE == args.length) {
				int arraySize = Integer.valueOf(args[ZERO]);
				System.out
						.println("ArraySize parameter passed in. Generating a "
								+ arraySize
								+ " elements array with 20 as max value");
				integerArray = generateRandomIntegers(arraySize, 20);
			} else if (2 == args.length) {
				int arraySize = Integer.valueOf(args[ZERO]);
				int maxValue = Integer.valueOf(args[ONE]);
				System.out
						.println("ArraySize and maxValue parameters passed in. Generating a "
								+ arraySize
								+ " elements array with "
								+ maxValue + " as max value");
				integerArray = generateRandomIntegers(arraySize, maxValue);
			} else {
				usage();
				return;
			}
		} catch (Exception e) {
			usage();
			return;
		}
		printArray(integerArray);
		Optional<Integer> sum = calculateSumOfMostCommon(integerArray);
		System.out.println("Sum of most common: "
				+ ((sum.isPresent()) ? sum.get() : "Unknown"));
	}
}
