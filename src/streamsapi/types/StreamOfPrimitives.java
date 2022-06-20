package streamsapi.types;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamOfPrimitives {
  public static void main(String[] args) {
    intStream();
    longStream();
    doubleStream();
  }

  private static void intStream() {
    IntStream.range(1, 5).forEach(System.out::println);
  }

  private static void longStream() {
    LongStream.range(1, 5).forEach(System.out::println);
  }

  private static void doubleStream() {
    new Random().doubles(5).forEach(System.out::println);
  }
}
