package learningJUnit.junit.testHelper;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import learningJUnit.junit.helper.StringHelper;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperBooleanParameterizedTest {

	StringHelper helper = new StringHelper();
	public StringHelperBooleanParameterizedTest(String input) {
		super();
		this.input = input;
		
	}
	private String input;
	
	
	@Parameters
	public static String[] testConditions()
	{
		String input[] = {"ABAB", "AB"};
		return input;
	}
/*@Test
	//test function should be defined as "void" and "public"
	//Each function handles with one test
	public void testTruncateAInFirst2Positions() {
		
		//fail("not implemented yet");
		//AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
		//expected, actual
		
	}*/
@Test
	public void testareFirstAndLastTwoCharactersTheSame()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
}
