package functionalinterface.function;

import java.util.function.Function;

public class FunctionInterface {
  public static void main(String[] args) {
    apply(26);
    compose(100, 3);
    andThen(200, 5);
    identity(100);
  }

  private static void apply(int number) {
    Function<Integer, String> function = n -> Integer.toString(n);
    System.out.println("Length of " + number + ": " + function.apply(number).length());
  }

  private static void compose(int number, int multiplier) {
    Function<Integer, String> integerFunction = num -> Integer.toString(num);
    integerFunction = integerFunction.compose(num -> num * multiplier);

    System.out.println(
        "Function accepts and returns "
            + multiplier
            + " times the number "
            + number
            + ", which gives: "
            + integerFunction.apply(number));
  }

  private static void andThen(int number, int multiplier) {
    // Function takes number and returns 5 times the number
    Function<Integer, Integer> integerFunction = num -> num * 10;
    integerFunction = integerFunction.andThen(num -> num * multiplier);

    System.out.println(
        "Function multiplies given number with 10 and returns "
            + multiplier
            + " times the number "
            + number
            + ", which gives: "
            + integerFunction.apply(number));
  }

  private static void identity(int number) {
    Function<Integer, Integer> integerFunction = Function.identity();

    System.out.println(integerFunction.apply(number));
  }
}
