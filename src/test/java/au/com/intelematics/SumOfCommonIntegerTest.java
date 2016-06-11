package au.com.intelematics;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


/**
 * Test class for SumOfCommonInteger
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest(SumOfCommonInteger.class)
public class SumOfCommonIntegerTest {
	
	/**
	 * Given the user access to PC
	 * When the user start the application
	 * Then the application object should constructed
	 * @throws Exception 
	 */
	@Test
	public void whenMainMethodCalledTheConstructorCalled() throws Exception {
		//Given the user access to PC
		SumOfCommonInteger mockApp = PowerMockito.mock(SumOfCommonInteger.class);
		PowerMockito.whenNew(SumOfCommonInteger.class).withNoArguments().thenReturn(mockApp);
		//When the main method called
		SumOfCommonInteger.main(null);
		//Then the constructor called
		PowerMockito.verifyNew(SumOfCommonInteger.class);
	}
	
	/**
	 * Given the user access to PC
	 * When the user start the application
	 * Then the application object should constructed
	 * @throws Exception 
	 */
	@Test
	public void whenConstructorCalledTheRandomCalled() throws Exception {
		//Given the user access to PC
		Random mockRandom = PowerMockito.mock(Random.class);
		TreeSet mockTreeSet = PowerMockito.mock(TreeSet.class);
		
		PowerMockito.whenNew(
				Random.class).withNoArguments().thenReturn(mockRandom);
//		PowerMockito.whenNew(TreeSet.class).withArguments(Matchers.any(MyIntegerComparator.class)).thenReturn(mockTreeSet);
		//When the constructor called
		new SumOfCommonInteger();
		//Then the constructor called
		PowerMockito.verifyNew(Random.class);
//		PowerMockito.verifyNew(TreeSet.class).withArguments(Matchers.any(MyIntegerComparator.class));
	}
}
