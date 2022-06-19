package functionalinterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
  public static void main(String[] args) {
    unaryOperator(10);
  }

  private static void unaryOperator(int number) {
    Function<Integer, Integer> function = n -> n * 10;
    System.out.println(function.apply(number));

    UnaryOperator<Integer> unaryOperator = k -> k * 2;
    System.out.println(unaryOperator.apply(number));
  }
}
