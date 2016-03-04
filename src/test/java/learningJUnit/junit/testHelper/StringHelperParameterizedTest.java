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
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	private String input;
	private String expectedOutput;
	
	@Parameters
	public static Collection<String[]> testConditions()
	{
		String expectedOutputs[][] = {{"AACD", "CD"},
		{"ACD", "CD"}};
		return Arrays.asList(expectedOutputs);
	}
@Test
	//test function should be defined as "void" and "public"
	//Each function handles with one test
	public void testTruncateAInFirst2Positions() {
		
		//fail("not implemented yet");
		//AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
		//expected, actual
		
	}
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition()
	{
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	/*@Test
	public void testTruncateAInFirst2Positions_NoAinFirstPosition()
	{//you also can highlight one function and use "run as JUnit test" to test a single test
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	@Test
	public void testTruncateAInFirst2Positions_AinLastPosition()
	{
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	//test second function
	//ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicNegative()
	{// ABCD => false
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}*/
	//@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicPositive()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	public void testareFirstAndLastTwoCharactersTheSame_SingleLetter()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
