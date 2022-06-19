package methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("Apple", "Banana", "guava", "grapes");
    helper(fruits);
  }

  private static void helper(List<String> fruits) {
    fruits.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
  }
}
