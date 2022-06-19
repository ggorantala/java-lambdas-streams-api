package functions;

public class ImpureFunction {
  public static void main(String[] args) {
    System.out.println(impureFunction(10));
  }

  public static double impureFunction(int value) {
    return Math.random() * value;
  }
}
