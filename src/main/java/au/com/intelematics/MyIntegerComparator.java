package au.com.intelematics;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator<MyInteger> {

	@Override
	public int compare(MyInteger o1, MyInteger o2) {

		int counter1 = o1.getCount();
		int counter2 = o2.getCount();
		return counter1 < counter2 ? -1 : counter2 < counter1 ? 1 : 0;
	}

}
