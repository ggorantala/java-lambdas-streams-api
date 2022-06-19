package declarative;

import commons.Book;
import commons.FakeData;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
  public static void main(String[] args) {
    List<Book> books = FakeData.getAllBooks();

    List<Book> declarativeApproach =
        books.stream().filter(book -> book.getCostInEuros() >= 5).collect(Collectors.toList());

    declarativeApproach.forEach(System.out::println);
  }
}
