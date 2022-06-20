package streamsapi;

import commons.Book;
import commons.FakeData;

import java.util.List;

public class StreamApplication {

  public static void main(String[] args) {
    List<Book> books = FakeData.getAllBooks();

    books.stream()// Stream<Book>, Stream of Books
        .filter(book -> book.getRating() >= 4)// Stream<Book>, Stream of Books
        .map(Book::getAuthor)
        .forEach(System.out::println);
  }
}
