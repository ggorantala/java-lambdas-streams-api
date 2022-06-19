package methodreference.kinds;

import commons.Book;
import commons.FakeData;

import java.util.List;

public class ReferenceToStatic {

  public static int compareByTitle(Book first, Book second) {
    return first.getTitle().compareTo(second.getTitle());
  }

  public static int compareByCost(Book first, Book second) {
    return first.getCostInEuros().compareTo(second.getCostInEuros());
  }

  public static void main(String[] args) {
    List<Book> books = FakeData.getAllBooks();

    System.out.println("SORT BASED ON PRICE: ");
    books.sort(ReferenceToStatic::compareByCost);
    books.stream()
        .map(book -> book.getTitle() + " -> " + book.getCostInEuros())
        .forEach(System.out::println);

    System.out.println("---------");

    System.out.println("SORT BASED ON TITLES: ");
    books.sort(ReferenceToStatic::compareByTitle);
    books.stream()
        .map(book -> book.getTitle() + " -> " + book.getRating())
        .forEach(System.out::println);
  }
}
