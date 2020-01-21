import static org.junit.Assert.*;
import org.junit.Test;

public class FactorTest {

	@Test
	public void testFindHcfPositiveInput() throws Exception {
		assertEquals(2, Factor.HCF(6, 8));
	}

	@Test
	public void testFindLcm() {
		try {
			Factor.LCM(0, 0);
		} catch (Exception e) {
			assertEquals("Divide By Zero", e.getMessage());
		}
	}

	@Test
	public void testFindLcmPositiveInput() throws Exception {
		assertEquals(24, Factor.LCM(6, 8));
	}

}
