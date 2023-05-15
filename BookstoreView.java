package co.edu.upb.finalExam;

import java.util.List;
import java.util.Scanner;

public class BookstoreView {
     private Scanner scanner;

     public BookstoreView() {
         scanner = new Scanner(System.in);
     }

     public void showMenu() {
         System.out.println("====== Library =====");
         System.out.println("1. Find books by title");
         System.out.println("2. Reserve book");
         System.out.println("3. Buy book");
         System.out.println("4. Return book");
         System.out.println("5. Find books by author");
         System.out.println("6. View sales report");
         System.out.println("7. Receive book recommendations");
         System.out.println("0. Exit");
         System.out.print("Enter the desired option: ");
     }

     public String askTitle() {
         System.out.print("Enter book title: ");
         return scanner. nextLine();
     }

     public String askAuthor() {
         System.out.print("Enter the author of the book: ");
         return scanner. nextLine();
     }

     public void showResults(List<Book> books) {
         if (books.isEmpty()) {
             System.out.println("No books were found with the specified criteria.");
         } else {
             System.out.println("Search results:");
             for (Book book : books) {
                 System.out.println("Title: " + book.getTitle());
                 System.out.println("Author: " + book.getAuthor());
                 System.out.println("Available: " + (book.isAvailable() ? "Yes" : "No"));
                 System.out.println("--------------------------");
             }
         }
     }
}