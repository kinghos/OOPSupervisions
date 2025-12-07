package SV3;

import java.util.Comparator;
import java.util.List;


public class Library {
    public record Book(String title, String author, int pages) {}

    public static void main(String[] args) {
        List<Book> library = List.of(
                new Book("Moby Dick", "Herman Melville", 720),
                new Book("1984", "George Orwell", 328),
                new Book("Ulysses", "James Joyce", 730),
                new Book("War and Peace", "Leo Tolstoy", 1225)
        );

        List<String> titles = library.stream()
                .filter(s -> s.pages > 500)
                .sorted(Comparator.comparing(Book::title))
                .map(Book::title)
                .toList();
        System.out.println(titles);
    }


}
