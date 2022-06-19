package functionalinterface.bifunction.example.demo;

public class Application {
  public static void main(String[] args) {
    QuadFunction<Integer, Integer, Integer, Integer, Integer> quadFunction =
        (t, u, v, w) -> t * u + v * w;

    System.out.println(quadFunction.apply(1, 2, 3, 4));
  }
}
