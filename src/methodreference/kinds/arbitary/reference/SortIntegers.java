package methodreference.kinds.arbitary.reference;

import java.util.Arrays;
import java.util.List;

public class SortIntegers {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(11, 4, 2, 8, 9, 10, 32, 22, 20, 17);
    helper(numbers);
  }

  private static void helper(List<Integer> nums) {
    nums.stream()
        .sorted(Integer::compareTo) // method reference
        .forEach(System.out::println);
  }
}
