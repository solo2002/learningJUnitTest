package learningJUnit.junit.testHelper;

import static org.junit.Assert.*;
import org.junit.Test;
import learningJUnit.junit.helper.StringHelper;

public class StringHelperTest {

	@Test
	public void test() {
		StringHelper helper = new StringHelper();
		//AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//expected, actual
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

}
