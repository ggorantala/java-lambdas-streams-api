package streamsapi.types;

import java.util.stream.Stream;

public class StreamBuilder {
  public static void main(String[] args) {
    helper();
  }

  private static void helper() {
    Stream.Builder<String> builder = Stream.builder();
    Stream<String> streamBuilder = builder.add("A").add("B").add("C").build();

    streamBuilder.forEach(System.out::println);
  }
}
