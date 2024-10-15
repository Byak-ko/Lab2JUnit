import org.example.Book;
import org.example.BookSorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BookSorterTest {

    @Test
    public void testSortByTitle() {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Java Programming", "John Doe", 2020, 29.99),
                new Book("Python Programming", "Jane Doe", 2019, 39.99),
                new Book("C++ Programming", "Jim Doe", 2021, 19.99)
        ));

        List<Book> sortedBooks = BookSorter.sortByTitle(books);

        assertEquals("C++ Programming", sortedBooks.get(0).getTitle());
        assertEquals("Java Programming", sortedBooks.get(1).getTitle());
        assertEquals("Python Programming", sortedBooks.get(2).getTitle());
    }


    @Test
    public void testSortByAuthor() {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Java Programming", "John Doe", 2020, 29.99),
                new Book("Python Programming", "Jane Doe", 2019, 39.99),
                new Book("C++ Programming", "Jim Doe", 2021, 19.99)
        ));

        List<Book> sortedBooks = BookSorter.sortByAuthor(books);

        assertEquals("Jane Doe", sortedBooks.get(0).getAuthor());
        assertEquals("Jim Doe", sortedBooks.get(1).getAuthor());
        assertEquals("John Doe", sortedBooks.get(2).getAuthor());
    }

    @Test
    public void testSortByYear() {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Java Programming", "John Doe", 2020, 29.99),
                new Book("Python Programming", "Jane Doe", 2019, 39.99),
                new Book("C++ Programming", "Jim Doe", 2021, 19.99)
        ));


        List<Book> sortedBooks = BookSorter.sortByYear(books);

        assertEquals(2019, sortedBooks.get(0).getYear());
        assertEquals(2020, sortedBooks.get(1).getYear());
        assertEquals(2021, sortedBooks.get(2).getYear());
    }

    @Test
    public void testSortByPrice() {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Java Programming", "John Doe", 2020, 29.99),
                new Book("Python Programming", "Jane Doe", 2019, 39.99),
                new Book("C++ Programming", "Jim Doe", 2021, 19.99)
        ));

        List<Book> sortedBooks = BookSorter.sortByPrice(books);

        assertEquals(19.99, sortedBooks.get(0).getPrice());
        assertEquals(29.99, sortedBooks.get(1).getPrice());
        assertEquals(39.99, sortedBooks.get(2).getPrice());
    }

    @Test
    public void testEmptyList() {
        List<Book> books = new ArrayList<>();
        List<Book> sortedBooks = BookSorter.sortByTitle(books);
        assertTrue(sortedBooks.isEmpty());
    }

    @Test
    public void testSingleBook() {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Java Programming", "John Doe", 2020, 29.99)
        ));
        List<Book> sortedBooks = BookSorter.sortByTitle(books);
        assertEquals(books, sortedBooks);
    }

}
