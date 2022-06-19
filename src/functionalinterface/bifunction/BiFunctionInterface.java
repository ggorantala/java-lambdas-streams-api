package functionalinterface.bifunction;

import java.util.function.BiFunction;

public class BiFunctionInterface {
  public static void main(String[] args) {
    biFunction(32, 32);
  }

  private static void biFunction(int A, int B) {
    BiFunction<Integer, Integer, Integer> biFunctionAddition = (X, Y) -> X + Y;

    System.out.println(biFunctionAddition.apply(A, B));
  }
}
