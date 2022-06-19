package typesofinterfaces;

import commons.Book;

// Functional Interface or Single Abstract interfaces
@FunctionalInterface
public interface SAMInterface {
  void addBook(Book book);
}
