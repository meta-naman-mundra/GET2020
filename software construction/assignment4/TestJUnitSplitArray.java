import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class TestJUnitSplitArray {

	@Test
	public void testSplitArray() {
		try {
			Split.splitArray(new int[] {});
		} catch (Exception e) {
			assertEquals("Empty Array", e.getMessage());
		}
	}

	@Test
	public void testSplitArrayOperation1() throws Exception {
		assertEquals(3, Split.splitArray(new int[] { 1, 1, 1, 2, 1 }));
	}

	@Test
	public void testSplitArrayOperation2() throws Exception {
		assertEquals(-1, Split.splitArray(new int[] { 2, 1, 1, 2, 1 }));
	}

	@Test
	public void testSplitArrayOperation3() throws Exception {
		assertEquals(1, Split.splitArray(new int[] { 10, 10 }));
	}

}