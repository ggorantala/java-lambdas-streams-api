package lambdas.example.demo;

import commons.Book;
import commons.FakeData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObjects {
  public static void main(String[] args) {
    List<Book> books = FakeData.getAllBooks();
    books.forEach(System.out::println);

    anonymousApproach(books);
    lambdaApproach(books);
    methodReferenceApproach(books);
    finalVersion(books);
  }

  private static void anonymousApproach(List<Book> books) {
    Collections.sort(
        books,
        new Comparator<Book>() {
          public int compare(Book p1, Book p2) {
            return p1.getTitle().compareTo(p2.getTitle());
          }
        });
    System.out.println("\nAFTER SORTING BASED ON TITLES: ");
    books.forEach(System.out::println);
  }

  private static void lambdaApproach(List<Book> books) {
    Collections.sort(
        books, (p1, p2) -> p1.getTitle().compareTo(p2.getTitle()) // lambda expression
        );
    System.out.println("\nAFTER SORTING BASED ON TITLES: ");
    books.forEach(System.out::println);
  }

  private static void methodReferenceApproach(List<Book> books) {
    Collections.sort(
        books, Comparator.comparing(Book::getTitle) // method reference
        );
    System.out.println("\nAFTER SORTING BASED ON TITLES: ");
    books.forEach(System.out::println);
  }

  private static void finalVersion(List<Book> books) {
    books.sort(Comparator.comparing(Book::getTitle));
    System.out.println("\nAFTER SORTING BASED ON TITLES: ");
    books.forEach(System.out::println);
  }
}
