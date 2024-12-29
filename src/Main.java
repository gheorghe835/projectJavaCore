import library.Book;
import library.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        int option;

        do {
            System.out.println("\n  Library Management System ");
            System.out.println("1.  Add book");
            System.out.println("2.  Borrow the book");
            System.out.println("3.  Return the book");
            System.out.println("4.  Display books");
            System.out.println("5.  Exit.");
            System.out.println("    Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("  Enter the book title:: ");
                    String title = scanner.nextLine();
                    System.out.println("  Introduce the author:: ");
                    String author = scanner.nextLine();
                    library.addBooks(new Book(title, author));
                    break;

                case 2:
                    System.out.println("  Enter the title of the book to borrow:: ");
                    title = scanner.nextLine();
                    library.borrowBook(title);
                    break;

                case 3:
                    System.out.println("  Enter the title of the book to return:: ");
                    title = scanner.nextLine();
                    library.returnBooks(title);
                    break;

                case 4:
                    library.showDetails();
                    break;

                case 5:
                    System.out.println("  Out of the library. Good times!");
                    break;

                default:
                    System.out.println("  Wrong option. Try again.");
            }

        }
        while (option != 5) ;

        scanner.close();
    }
}