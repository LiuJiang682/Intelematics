package au.com.intelematics;

import java.util.Random;
import java.util.TreeSet;

public class SumOfCommonInteger {

	private Random random;
	private TreeSet<MyInteger> treeSet;
	
	public SumOfCommonInteger() {
		this.random = new Random(); 
		this.treeSet = new TreeSet<>(new MyIntegerComparator());
	}
	
	public static void main(String[] args) {
		new SumOfCommonInteger().run();
	}

	protected void run() {
		
		
	}
}
