package library;

public class PrintTask {
    public static void main(String[] args) {
        System.out.println("Simple project: a library management system (add books, loans, etc.).\n" +
                " ------------------------------------------------------------------------------------------------------------------------------------\n" +
                "Project outline: Library management system\n" +
                "1. Main classes:\n" +
                "- Book: represents the information of a book (title, author, availability status).\n" +
                "- User: Represents a library user (name, id) who can borrow and return books.\n" +
                "- Library: Represents the library as an entity containing a collection of books and methods for managing loans and returns.\n" +
                "- Main: The main class that interacts with the user to perform add, borrow, return, list books, etc. operations.\n" +
                "\n" +
                "2. Project structure:\n" +
                "\n" +
                "LibraryManagementSystem/\n" +
                "│\n" +
                "├─── Book.java # Class for representing books\n" +
                "├─── User.java # Class for users\n" +
                "├─── Library.java # Class for managing books\n" +
                "├─── Main.java # Main class for user interaction" +
                "3. Details classes and methods:\n" +
                "- Class Book:\n" +
                "o Attributes:\n" +
                "\uF0A7 String title: Title of the book.\n" +
                "\uF0A7 String author: Author of the book.\n" +
                "\uF0A7 boolean isBorrowed: The status of the book (available or borrowed).\n" +
                "o Methods:\n" +
                "\uF0A7 borrow(): Marks the book as borrowed.\n" +
                "\uF0A7 return(): Marks the book as available.\n" +
                "- User Class:\n" +
                "o Attributes:\n" +
                "\uF0A7 String name: User name.\n" +
                "\uF0A7 int idUser: The unique ID of the user.\n" +
                "o Methods:\n" +
                "\uF0A7 borrowBook(BookBook): Allows the user to borrow a book.\n" +
                "\uF0A7 returnBook(BookBookBook): Allows the user to return a book.\n" +
                "\n" +
                "- Library Class:\n" +
                "o Attributes:\n" +
                "\uF0A7 ArrayList<Book> books: List of books in the library.\n" +
                "o Methods:\n" +
                "\uF0A7 addBook(BookBookBook): Adds a book to the library.\n" +
                "\uF0A7 listaCarti(): Displays available books.\n" +
                "\uF0A7 borrowBook(BookBook): Lets you borrow a book.\n" +
                "\uF0A7 returnBook(BookBook): Returns a book.\n" +
                "- Main class:\n" +
                "o Allows user interaction through the menu:\n" +
                "\uF0A7 List available books.\n" +
                "\uF0A7 Borrowing books.\n" +
                "\uF0A7 Returning books.\n" +
                "\uF0A7 Exiting the program.\n" +
                "4. Flow of operations:\n" +
                "1.\tAdding books: The administrator or system adds books to the library.\n" +
                "2.\tListing books: User can view the books available for loan.\n" +
                "3.\tBorrowing books: The user borrows an available book.\n" +
                "4. Return books: The user returns the borrowed books.\n" +
                "5.\tClosing the application: The user can close the application.\n" +
                "\n" );
    }
}
