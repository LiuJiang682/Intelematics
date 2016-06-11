package au.com.intelematics;

import static org.junit.Assert.assertFalse;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
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
		
		PowerMockito.whenNew(
				Random.class).withNoArguments().thenReturn(mockRandom);
//		PowerMockito.whenNew(TreeSet.class).withArguments(Matchers.any(MyIntegerComparator.class)).thenReturn(mockTreeSet);
		//When the constructor called
		new SumOfCommonInteger();
		//Then the constructor called
		PowerMockito.verifyNew(Random.class);
//		PowerMockito.verifyNew(TreeSet.class).withArguments(Matchers.any(MyIntegerComparator.class));
	}

	
	/**
	 * Given a SumOfCommonInteger object
	 * When the run method called
	 * Then 1000 number should dumped
	 */
	@Test
	public void whenRunCalledThen1000NumberShouldDump() {
		//Given a SumOfCommonInteger object
		SumOfCommonInteger sumOfCommonInteger = new SumOfCommonInteger();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		//When run method called
		sumOfCommonInteger.run();
		//Then 1000 integer should be dumped
		String content = new String(baos.toByteArray(), StandardCharsets.UTF_8);
		assertFalse(StringUtils.isBlank(content));
	}

}
