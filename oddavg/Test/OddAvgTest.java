import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OddAvgTest {
   private static List<Integer> testList;
   private static int testSumTrue;
   private static int testSumFalse;
   private static OddAvg testOddAvg;

  @BeforeClass
  public static void beforeAll() {
    testList = new ArrayList<>();
    testList.add(1);
    testList.add(2);
    testList.add(3);
    testSumTrue = 4;
    testSumFalse = 5;

    testOddAvg = new OddAvg(testList);

  }
  @Test
  public void testEqual() throws Exception {
    assertEquals(testOddAvg.oddAverage(testList), testSumTrue);
  }

  @Test
  public void testEqualTrue() throws Exception {
    assertTrue(testOddAvg.oddAverage(testList) == testSumTrue);
  }

  @Test
  public void testEqualFalse() throws Exception {
    assertFalse(testOddAvg.oddAverage(testList) == testSumFalse);
  }

}