package co.edu.upb.finalExam;

public class Book {

	private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // Getters y setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Otros métodos relevantes
    public void reserve() {
        if (available) {
            available = false;
            System.out.println("Book reserved: " + title);
        } else {
            System.out.println("Book not available for reservation: " + title);
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not borrowed: " + title);
        }
    }
}
