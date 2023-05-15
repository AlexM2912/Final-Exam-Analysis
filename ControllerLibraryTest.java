package co.edu.upb.finalExam;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ControllerLibraryTest {
    private BookstoreView bookstoreView;
    private Bookstore bookstore;
    private ControllerLibrary controller;

    @Before
    public void setUp() {
        bookstoreView = mock(BookstoreView.class);
        bookstore = mock(Bookstore.class);
        controller = new ControllerLibrary(bookstoreView, bookstore);
    }

    @Test
    public void testProcessAction_SearchByTitle() {
        // Arrange
        String title = "The Catcher in the Rye";
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("The Catcher in the Rye"));

        when(bookstore.searchBooksByTitle(title)).thenReturn(expectedBooks);

        // Act
        controller.processAction(1);

        // Assert
        verify(bookstoreView).promptTitle();
        verify(bookstore).searchBooksByTitle(title);
        verify(bookstoreView).displaySearchResults(expectedBooks);
    }

    @Test
    public void testProcessAction_ReserveBook_Successful() {
        // Arrange
        String title = "1984";
        Book expectedBook = new Book("1984");

        when(bookstore.reserveBook(title)).thenReturn(expectedBook);

        // Act
        controller.processAction(2);

        // Assert
        verify(bookstoreView).promptTitle();
        verify(bookstore).reserveBook(title);
        verify(bookstoreView).displayMessage("Book reserved successfully: " + expectedBook.getTitle());
    }

    @Test
    public void testProcessAction_ReserveBook_Failure() {
        // Arrange
        String title = "Harry Potter";

        when(bookstore.reserveBook(title)).thenReturn(null);

        // Act
        controller.processAction(2);

        // Assert
        verify(bookstoreView).promptTitle();
        verify(bookstore).reserveBook(title);
        verify(bookstoreView).displayMessage("Failed to reserve the book.");
    }

    // Rest of the test methods for other actions...

}