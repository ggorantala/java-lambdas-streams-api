package lambdas.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerOperations {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(22, 2, 11, 2, 3, 7);
    System.out.println("Input: " + numbers);
    sorting(numbers);
    evenOddSeparation(numbers);
    removeDuplicates(numbers);
  }

  private static void sorting(List<Integer> nums) {
    List<Integer> sortedNumbers =
        nums.stream()
            .sorted((p1, p2) -> p1.compareTo(p2)) // lambda expression
            .collect(Collectors.toList());

    System.out.println("Sorted Order: " + sortedNumbers);
  }

  private static void evenOddSeparation(List<Integer> nums) {
    List<Integer> evenNumbers =
        nums.stream()
            .filter(number -> number % 2 == 0) // even filter
            .toList();

    System.out.println("Even Numbers are: " + evenNumbers);

    List<Integer> oddNumbers =
        nums.stream()
            .filter(number -> number % 2 != 0) // odd filter
            .toList();

    System.out.println("Odd Numbers are: " + oddNumbers);
  }

  private static void removeDuplicates(List<Integer> nums) {
    List<Integer> uniqueValues =
        nums.stream()
            .distinct() // unique set
            .toList();

    System.out.println("uniqueValues are: " + uniqueValues);
  }
}
