package streamsapi.types;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmptyStream {
  public static void main(String[] args) {
    List<String> languages = Arrays.asList("English", "Spanish", "French", "Hindi");
    isEmptyStream(languages).forEach(System.out::println);
  }

  // this is how we check and give empty stream.
  public static Stream<String> isEmptyStream(List<String> languages) {
    return languages == null || languages.isEmpty() ? Stream.empty() : languages.stream();
  }
}
