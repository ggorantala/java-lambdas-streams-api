package streamsapi.types;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOfArrays {
  public static void main(String[] args) {
    streamOf();
    arraysStream();
  }

  private static void streamOf() {
    Stream<Integer> values = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Stream<Integer>
    values.forEach(System.out::println);
  }

  private static void arraysStream() {
    String[] languages = new String[] {"English", "Spanish", "French", "Hindi"}; // String[], array of strings
    Stream<String> stringStream = Arrays.stream(languages); // Stream<String>
    stringStream.forEach(System.out::println);
  }
}
