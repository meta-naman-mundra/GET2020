import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class TestJunit {


   @Test
   public void testMaxMirrorArray1() {
	   try { Array.maxMirror(new int[]{ }); }
	   catch (Exception e) { assertEquals("Empty Array", e.getMessage());}
   }

   @Test
   public void testMaxMirror1() throws Exception {	  
      assertEquals(3,Array.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
   }
   @Test
   public void testMaxMirror2() throws Exception{	  
      assertEquals(2,Array.maxMirror(new int[]{7,1,4,9,7,4,1}));
   }
   @Test
   public void testMaxMirror3() throws Exception{	  
      assertEquals(3,Array.maxMirror(new int[]{1, 2, 1,4}));
   }
   @Test
   public void testMaxMirror4() throws Exception{	  
      assertEquals(7,Array.maxMirror(new int[]{1, 4, 5, 3, 5, 4, 1}));
   }

}