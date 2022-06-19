package methodreference.kinds.contructor;

import commons.Book;

@FunctionalInterface
public interface BookService {
  Book getBook(
      String title,
      String author,
      Integer year,
      Integer copiesSoldInMillions,
      Double rating,
      Double costInEuros);
}
