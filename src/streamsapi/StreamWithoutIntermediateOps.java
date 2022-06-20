package streamsapi;

import commons.Book;
import commons.FakeData;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithoutIntermediateOps {

  public static void main(String[] args) {
    Map<String, Integer> bookSold =
        FakeData.getAllBooks().stream()
            .collect(Collectors.toMap(Book::getAuthor, Book::getCopiesSoldInMillions));

    System.out.println(bookSold);
  }
}
