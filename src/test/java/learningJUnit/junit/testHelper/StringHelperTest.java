package learningJUnit.junit.testHelper;

import static org.junit.Assert.*;
import org.junit.Test;
import learningJUnit.junit.helper.StringHelper;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	@Test
	//test function should be defined as "void" and "public"
	//Each function handles with one test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		//AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//expected, actual
		
	}
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition()
	{
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions_NoAinFirstPosition()
	{//you also can highlight one function and use "run as JUnit test" to test a single test
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
}
