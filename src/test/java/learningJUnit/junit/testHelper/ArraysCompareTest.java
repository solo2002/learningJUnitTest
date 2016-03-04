package learningJUnit.junit.testHelper;

import static org.junit.Assert.*;
import java.lang.reflect.Array;
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
	@Test
	public void testArraySort_NullArray()
	{
		int[] numbers = null;
		try
		{
			Arrays.sort(numbers);
		} catch (NullPointerException e)
		{
			
		}
	}
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray2()
	{
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout = 100)//test performance
	//fails if it can not finished in 100 mili seconds
	public void testSort_Performance()
	{
		int[] array = {12, 23, 6};
		for(int i = 1; i <= 1000000; i++)
		{
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
