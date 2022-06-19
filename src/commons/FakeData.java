package commons;

import java.util.Arrays;
import java.util.List;

public class FakeData {
  public static List<Book> getAllBooks() {
    return Arrays.asList(
        new Book("Don Quixote", "Miguel de Cervantes", 1605, 500, 3.9, 9.99),
        new Book("A Tale of Two Cities", "Charles Dickens", 1859, 200, 3.9, 10.0),
        new Book("The Lord of the Rings", "J.R.R. Tolkien", 2001, 150, 4.0, 12.50),
        new Book("The Little Prince", "Antoine de Saint-Exupery", 2016, 142, 4.4, 5.0),
        new Book("The Dream of the Red Chamber", "Cao Xueqin", 1791, 100, 4.2, 10.0));
  }
}
