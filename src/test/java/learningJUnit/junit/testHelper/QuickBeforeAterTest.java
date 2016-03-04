package learningJUnit.junit.testHelper;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAterTest {
	
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
}
