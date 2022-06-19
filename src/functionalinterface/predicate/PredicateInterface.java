package functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateInterface {
  public static void main(String[] args) {
    helper("Apples");
    helper("Oranges");
  }

  private static void helper(String str) {
    Predicate<String> stringPredicate = s -> s.length() <= 6;

    System.out.println(stringPredicate.test(str));
  }
}
