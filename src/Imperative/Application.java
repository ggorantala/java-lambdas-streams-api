package Imperative;

import commons.Book;
import commons.FakeData;

import java.util.ArrayList;
import java.util.List;

public class Application {
  public static void main(String[] args) {
    List<Book> books = FakeData.getAllBooks();
    List<Book> imperativeApproach = new ArrayList<>();

    for (Book book : books) {
      if (book.getCostInEuros() >= 5) {
        imperativeApproach.add(book);
      }
    }

    imperativeApproach.forEach(System.out::println);
  }
}
