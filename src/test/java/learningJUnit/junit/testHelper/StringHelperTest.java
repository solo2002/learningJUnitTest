package learningJUnit.junit.testHelper;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import learningJUnit.junit.helper.StringHelper;

public class StringHelperTest {

	StringHelper helper;
	@Before
	public void before()
	{
		helper = new StringHelper();
	}
	@Test
	//test function should be defined as "void" and "public"
	//Each function handles with one test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		
		//fail("not implemented yet");
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
	}
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
