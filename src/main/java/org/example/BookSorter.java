package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookSorter {
    public static List<Book> sortByTitle(List<Book> books) {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        return books;
    }

    public static List<Book> sortByAuthor(List<Book> books) {
        Collections.sort(books, Comparator.comparing(Book::getAuthor));
        return books;
    }

    public static List<Book> sortByYear(List<Book> books) {
        Collections.sort(books, Comparator.comparingInt(Book::getYear));
        return books;
    }

    public static List<Book> sortByPrice(List<Book> books) {
        Collections.sort(books, Comparator.comparingDouble(Book::getPrice));
        return books;
    }
}
