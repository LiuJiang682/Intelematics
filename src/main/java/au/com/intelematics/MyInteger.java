package au.com.intelematics;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

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

	public void increament() {
		++count;
	}
	
	public int hashCode() {
		return key;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (null == obj) 
			return false;
		if (!(obj instanceof MyInteger))
			return false;
		MyInteger rhs = (MyInteger) obj;
		return (this.key == rhs.key) ? true : false;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
