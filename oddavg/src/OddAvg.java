import java.util.ArrayList;
import java.util.List;

public class OddAvg {

  List<Integer> numberList;

  public OddAvg(List<Integer> numberList) {
    this.numberList = numberList;
  }

  public static void main(String[] args) {

    List<Integer> numberList = new ArrayList<>();
    for (int i = 1; i < 6; i++) {
      numberList.add(i);
    }
    System.out.println(oddAverage(numberList));

  }
  public static boolean isOdd(int a) {
    return (a % 2 != 0);
  }

  public static int oddAverage(List<Integer> numberList) {
    int sum = 0;
    for (int i = 0; i < numberList.size(); i++) {
      if (isOdd(numberList.get(i))) {
        sum = sum + numberList.get(i);
      }
    }
    return sum;
  }
}