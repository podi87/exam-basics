import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OddAvgTest {
   static List<Integer> testList;
   static int testSum;
   static OddAvg testOddAvg;

  @BeforeClass
  public static void beforeAll() {
    testList = new ArrayList<>();
    testList.add(1);
    testList.add(2);
    testList.add(3);
    testSum = 4;
    testOddAvg = new OddAvg(testList);

  }
  @Test
  public void oddAverage(List<Integer> testList) throws Exception {
    assertEquals(oddAverage(testList) == testSum);


  }

  @Test
  public void testEqualTrue() throws Exception {

  }

  @Test
  public void testEqualFalse() throws Exception {

  }

}