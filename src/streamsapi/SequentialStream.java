package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SequentialStream {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    sequentialStream(nums);
  }

  private static void sequentialStream(List<Integer> nums) {
    List<Integer> evenNumbers =
        nums.stream() // Stream<Integer>, sequential stream of integers
            .filter(s -> s % 2 == 0) //
            .collect(Collectors.toList());

    System.out.println("Even Numbers: " + evenNumbers);
  }
}
