package commons;

public class Book {
  private final String title;
  private final String author;
  private final int year;
  private final int copiesSoldInMillions;
  private final double rating;
  private final double costInEuros;

  public Book(
      String title,
      String author,
      int year,
      int copiesSoldInMillions,
      double rating,
      double costInEuros) {
    this.title = title;
    this.author = author;
    this.year = year;
    this.copiesSoldInMillions = copiesSoldInMillions;
    this.rating = rating;
    this.costInEuros = costInEuros;
  }

  public Double getCostInEuros() {
    return costInEuros;
  }

  public double getRating() {
    return rating;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return "commons.Book{ title="
        + title
        + ", author="
        + author
        + ", copiesSoldInMillions="
        + copiesSoldInMillions
        + ", costInEuros="
        + costInEuros
        + "}";
  }
}
