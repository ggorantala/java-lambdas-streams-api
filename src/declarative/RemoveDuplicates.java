package declarative;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 7, 8);
    List<Integer> uniqueValues = values.stream().distinct().collect(Collectors.toList());

    System.out.println("Unique list1 : " + uniqueValues);
  }
}
