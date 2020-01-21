import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SelectorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


 @Test
   public void testKMin1() {
      int[] a = {-4, -4};
      int k = 2;
      int expected = 2;
      int actual = LinearSearch1.search(a, target);
      assertEquals(expected, actual);
   }

}
