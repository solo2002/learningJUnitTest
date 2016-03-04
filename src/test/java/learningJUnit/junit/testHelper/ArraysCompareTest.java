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

}
