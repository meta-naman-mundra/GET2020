import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class TestJUnitClumps {

	@Test
	public void testcountClumpsArray() {
		try {
			ArrayClumps.countClumps(new int[] {});
		} catch (Exception e) {
			assertEquals("Empty Array", e.getMessage());
		}
	}

	@Test
	public void testCountClumps1() throws Exception {
		assertEquals(2, ArrayClumps.countClumps(new int[] { 1, 2, 2, 3, 4, 4 }));
	}

	@Test
	public void testCountClumps2() throws Exception {
		assertEquals(2, ArrayClumps.countClumps(new int[] { 1, 1, 2, 1, 1 }));
	}

	@Test
	public void testCountClumps3() throws Exception {
		assertEquals(1, ArrayClumps.countClumps(new int[] { 1, 1, 1, 1, 1 }));
	}

}