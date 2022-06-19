package typesofinterfaces;

import commons.Book;

import java.util.List;

// Types of Interfaces lesson
public interface BookService {
  void addBook(Book book);

  void deleteBook(Long bookId);

  void updateBook(Long bookId, Book book);

  void deleteBooksByAuthor(String authorName);

  List<Book> getAllBooks();

  Book findBookById(Long bookId);
}
