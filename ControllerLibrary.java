package co.edu.upb.finalExam;

import java.util.List;

public class ControllerLibrary {
    private BookstoreView bookstoreView;
    private Bookstore bookstore;

    public ControllerLibrary(BookstoreView bookstoreView, Bookstore bookstore) {
        this.bookstoreView = bookstoreView;
        this.bookstore = bookstore;
    }

    public void processAction(int option) {
        switch (option) {
            case 1: // Search by title
                String title = bookstoreView.promptTitle();
                List<Book> foundBooks = bookstore.searchBooksByTitle(title);
                bookstoreView.displaySearchResults(foundBooks);
                break;
            case 2: // Reserve book
                title = bookstoreView.promptTitle();
                Book reservedBook = bookstore.reserveBook(title);
                if (reservedBook != null) {
                    bookstoreView.displayMessage("Book reserved successfully: " + reservedBook.getTitle());
                } else {
                    bookstoreView.displayMessage("Failed to reserve the book.");
                }
                break;
            case 3: // Purchase book
                title = bookstoreView.promptTitle();
                boolean purchased = bookstore.purchaseBook(title);
                if (purchased) {
                    bookstoreView.displayMessage("Book purchased successfully: " + title);
                } else {
                    bookstoreView.displayMessage("Failed to purchase the book.");
                }
                break;
            case 4: // Return book
                title = bookstoreView.promptTitle();
                boolean returned = bookstore.returnBook(title);
                if (returned) {
                    bookstoreView.displayMessage("Book returned successfully: " + title);
                } else {
                    bookstoreView.displayMessage("Failed to return the book.");
                }
                break;
            case 5: // Search by author
                String author = bookstoreView.promptAuthor();
                foundBooks = bookstore.searchBooksByAuthor(author);
                bookstoreView.displaySearchResults(foundBooks);
                break;
            case 6: // View sales report
                // Logic to display the sales report
                break;
            case 7: // Receive book recommendations
                // Logic to receive book recommendations
                break;
            case 0: // Exit
                System.exit(0);
                break;
            default:
                bookstoreView.displayMessage("Invalid option.");
                break;
        }
    }
}
