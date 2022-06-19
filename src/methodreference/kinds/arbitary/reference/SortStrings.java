package methodreference.kinds.arbitary.reference;

import java.util.Arrays;
import java.util.List;

public class SortStrings {
  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("Banana", "Grapes", "Oranges", "apples");
    helper(fruits);
  }

  private static void helper(List<String> fruits) {
    fruits.sort(String::compareToIgnoreCase);
    fruits.forEach(System.out::println);
  }
}
