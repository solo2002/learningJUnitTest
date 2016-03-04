package learningJUnit.junit.testHelper;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAterTest {
	@BeforeClass//only show up one time, should be static
	public static void beforeClass()
	{
		System.out.println("Before class");
	}
	@Before
	public void setup()
	{
		System.out.println("Before Test");
	}

	@Test
	public void test1() {
		//fail("Not yet implemented");
		System.out.println("test1 executed");
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		System.out.println("test2 executed");
	}
	
	@After
	public void teardown()
	{
		System.out.println("=======");
	}
	@AfterClass//only show up one time, should be static
	public static void afterClass()
	{
		System.out.println("After class");
	}
}
