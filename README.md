![WhatsApp Image 2023-05-15 at 12 40 21 PM](https://github.com/AlexM2912/Final-Exam-Analysis/assets/129182783/be7e2c5f-2c86-4cc7-b39b-2ac7ebbe7ff7)
# Bookstore System

This project is a Bookstore System that follows the Model-View-Controller (MVC) architectural pattern. It allows users to search for books, reserve them, purchase them, return them, and view sales reports. The system consists of the following components:

## Model
The Model component represents the data and business logic of the Bookstore System. It includes the following classes:
- `Book`: Represents a book with properties such as ISBN, title, and author. It provides methods to get and set these properties.
- `Bookstore`: Represents the collection of books in the bookstore. It provides methods for searching books by title or author, reserving books, purchasing books, returning books, and generating sales reports.

## View
The View component is responsible for the user interface and interactions with the user. It includes the following classes:
- `BookstoreView`: Provides methods for displaying prompts, messages, and search results to the user. It interacts with the user to get input such as book titles or authors.

## Controller
The Controller component acts as an intermediary between the Model and View components. It handles user actions and updates the Model accordingly. It includes the following class:
- `ControllerLibrary`: Receives user actions from the View, interacts with the Model to perform the corresponding operations, and communicates the results back to the View for display.

## Responsibilities
- The Model (Book and Bookstore classes) is responsible for managing the data, performing business logic operations, and providing methods for searching, reserving, purchasing, and returning books. It ensures the integrity and consistency of the data.
- The View (BookstoreView class) is responsible for presenting information to the user, displaying prompts and messages, and receiving input from the user.
- The Controller (ControllerLibrary class) is responsible for receiving user actions, invoking the appropriate methods on the Model, and updating the View with the results.

By dividing the responsibilities in this way, the system achieves a separation of concerns, making it easier to maintain and modify each component independently. The Model encapsulates the data and logic, the View handles the user interface, and the Controller orchestrates the interactions between the Model and View.

This MVC architecture promotes code reusability, testability, and maintainability. It allows for modular development, where each component can be developed, tested, and updated independently. It also enables easier collaboration between multiple developers, as they can work on different components simultaneously.

Feel free to explore the code and expand upon it to add more features or enhance existing functionalities based on the MVC architecture.

## Usage
To use the Bookstore System, you can create an instance of the `ControllerLibrary` class, passing the necessary dependencies (BookstoreView and Bookstore) to its constructor. Then, you can call the `processAction` method on the controller instance to handle user actions based on the provided options.

```java
// Create instances of View and Model
BookstoreView bookstoreView = new BookstoreView();
Bookstore bookstore = new Bookstore();

// Create an instance of Controller
ControllerLibrary controller = new ControllerLibrary(bookstoreView, bookstore);

// Process user actions
int option = // Get user input for the desired action
controller.processAction(option);
```

Ensure that you have the necessary dependencies and configurations set up before running the code.
