package au.com.intelematics;

import java.io.Serializable;

public class MyInteger implements Serializable {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -4587580701915665672L;
	
	private int key;
	private int count;
	
	public MyInteger(final int key) {
		this.key = key;
		this.count = 1;
	}

	public int getKey() {
		return key;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}


}
