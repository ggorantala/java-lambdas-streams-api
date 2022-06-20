package streamsapi.types;

import java.util.stream.Stream;

public class StreamIterate {
  public static void main(String[] args) {
    helper();
  }

  private static void helper() {
    Stream.iterate(1, n -> n + 3)
        .limit(12) // limiting to first 12 streams
        .forEach(System.out::println);
  }
}
