package methodreference.kinds.contructor;

import commons.Book;

public class ReferenceToConstructor {
  public static void main(String[] args) {
    BookService bookService = Book::new;
    Book book =
        bookService.getBook("The Little Prince", "Antoine de Saint-Exupery", 2016, 142, 4.4, 5.0);

    System.out.println(book);
  }
}
