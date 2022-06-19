package methodreference.kinds;

import commons.Book;
import commons.FakeData;

import java.util.List;

public class ReferenceToInstance {
    public static void main(String[] args) {
        List<Book> books = FakeData.getAllBooks();

        ReferenceToInstance referenceToInstance = new ReferenceToInstance();

        System.out.println("SORT BASED ON PRICE");
        books.sort(referenceToInstance::compareByCost);
        books.stream()
                .map(book -> book.getTitle() + " -> " + book.getCostInEuros())
                .forEach(System.out::println);

        System.out.println();

        System.out.println("SORT BASED ON TITLES: ");
        books.sort(referenceToInstance::compareByTitle);
        books.stream()
                .map(book -> book.getTitle() + " -> " + book.getRating())
                .forEach(System.out::println);
    }

    public int compareByTitle(Book first, Book second) {
        return first.getTitle().compareTo(second.getTitle());
    }

    public int compareByCost(Book first, Book second) {
        return first.getCostInEuros().compareTo(second.getCostInEuros());
    }
}
