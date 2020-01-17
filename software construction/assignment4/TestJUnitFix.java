import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class TestJUnitFix { 
	@Test
	   public void testfixXYArray() {
	   try { Fix_array.fixXY(new int[]{ },4,5); }
	   catch (Exception e) { assertEquals("Empty Array", e.getMessage());}}
	
	@Test
	   public void testFixXY1() throws Exception{	
		   int returnedArrayOperation[] = Fix_array.fixXY(new int[]{5, 4, 9, 4, 9, 5},4,5);
		   int []expectedArr = new int[]{9, 4, 5, 4, 5, 9};
		   Assert.assertArrayEquals( expectedArr, returnedArrayOperation );
	   }
	   @Test
	   public void testFixXY2() throws Exception{	
		   int returnedArrayOperation[] = Fix_array.fixXY(new int[]{1,4,1,5},4,5);
		   int []expectedArr = new int[]{1,4,5,1};
		   Assert.assertArrayEquals( expectedArr, returnedArrayOperation );
	   }
	   @Test
	   public void testFixXY3() throws Exception{	
		   int returnedArrayOperation[] = Fix_array.fixXY(new int[]{1,4,1,5,5,4,1},4,5);
		   int []expectedArr = new int[]{1,4,5,1,1,4,5};
		   Assert.assertArrayEquals( expectedArr, returnedArrayOperation );
	   }

}

