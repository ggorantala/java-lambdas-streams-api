package streamsapi.types;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerate {
  public static void main(String[] args) {
    helper();
  }

  private static void helper() {
    Stream.generate(new Random()::nextDouble)
        .limit(5) // we need to limit or it loops infinitely
        .forEach(System.out::println);
  }
}
