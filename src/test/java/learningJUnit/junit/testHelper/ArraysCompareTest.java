package learningJUnit.junit.testHelper;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12, 3, 6, 1};
		int[] expected = {1, 3, 6, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
		//Must use assertArrayEquals: compare value
		//assertEquals: compare reference address
	}
	@Test (expected = NullPointerException.class)
	public void testArraySort_NullArray()
	{
		int[] numbers = null;
		Arrays.sort(numbers);
		/*try
		{
			Arrays.sort(numbers);
		} catch (NullPointerException e)
		{
			//success
		}*/
	}

}
