package au.com.intelematics;

import java.util.ArrayList;
import java.util.Random;

/**
 * This 
 *
 */
public class SumOfCommonInteger {

	private static final int NOT_FOUND = -1;
	private Random random;
	private ArrayList<MyInteger> myList;
	
	public SumOfCommonInteger() {
		this.random = new Random(); 
		this.myList = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		new SumOfCommonInteger().run();
	}

	protected void run() {
		//First passing: Populate the list
		for (int i = 0; i < 1000; i++) {
			MyInteger myInteger = new MyInteger(random.nextInt(100));
			int index = myList.indexOf(myInteger);
			if (NOT_FOUND == index) {
				//First entry, add it into list.
				myList.add(myInteger);
			}
			else {
				//Existing entry, increase the count
				MyInteger existing = myList.get(index);
				existing.increament();		
			}
		}
		// Second passing: find out the most common integer
		MyInteger mostCommon = myList.get(0);
		int len = myList.size();
		for (int j = 1; j < len; j++) {
			MyInteger myInteger = myList.get(j);
			System.out.println(myInteger.toString());
			if (mostCommon.getCount() < myInteger.getCount())
				mostCommon = myInteger;
		}
		
		System.out.println("Sum of common integer: " + mostCommon.getKey() + " * " + mostCommon.getCount() + " = " + mostCommon.getCount() * mostCommon.getKey());
		
	}
}
