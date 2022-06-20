package streamsapi.types;

import java.util.ArrayList;
import java.util.List;

public class StreamCollections {
  public static void main(String[] args) {
    List<String> languages = new ArrayList<>();
    languages.add("Spanish");
    languages.add("Hindi");
    languages.add("English");
    languages.add("French");

    printLanguages(languages);
  }

  private static void printLanguages(List<String> languages) {
    languages.stream() // Stream<String>
        .forEach(System.out::println);
  }
}
