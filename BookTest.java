package co.edu.upb.finalExam;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void testGetTitle() {
        // Arrange
        Book book = new Book("1234567890", "Test Book", "John Doe");

        // Act
        String title = book.getTitle();

        // Assert
        assertEquals("Test Book", title);
    }

    @Test
    public void testGetISBN() {
        // Arrange
        Book book = new Book("1234567890", "Test Book", "John Doe");

        // Act
        String isbn = book.getISBN();

        // Assert
        assertEquals("1234567890", isbn);
    }

    @Test
    public void testGetAuthor() {
        // Arrange
        Book book = new Book("1234567890", "Test Book", "John Doe");

        // Act
        String author = book.getAuthor();

        // Assert
        assertEquals("John Doe", author);
    }

    @Test
    public void testSetAuthor() {
        // Arrange
        Book book = new Book("1234567890", "Test Book", "John Doe");

        // Act
        book.setAuthor("Jane Smith");

        // Assert
        assertEquals("Jane Smith", book.getAuthor());
    }
}
