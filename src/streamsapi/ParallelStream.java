package streamsapi;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    parallelStream(nums);
  }

  private static void parallelStream(List<Integer> nums) {
    nums.parallelStream()
        // Stream<Integer>, parallel stream of integers
        .forEach(System.out::println);
  }
}
