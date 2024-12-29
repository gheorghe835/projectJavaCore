package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;



    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public Library(){
        this.books = new ArrayList<>();
    }

    //Metoda de adaugare a cartii
    public void addBooks(Book book){
        books.add(book);
        System.out.println("  Book added:: " + book.getTitle());
    }

    //Metoda de imprumutare a cartilor
    public void borrowBook(String title){
        for (Book book:
             books) {
            if(book.getTitle().equalsIgnoreCase(title) & book.isStatus()){
                book.borrow();
                System.out.println("  Borrowed book:: " + title);
            }
            else {
                System.out.println("  The book is currently not available or does not exist.");
            }
        }
    }
    //Metoda de returnare a cartilor
    public void returnBooks(String title){
        for (Book book:
             books) {
            if(book.getTitle().equalsIgnoreCase(title) & !book.isStatus()){
                book.returns();
                System.out.println("  Book returned:: " + title);
                return;
            }
            else {
                System.out.println("  The book was not borrowed or does not exist.");
            }
        }
    }

    //Metoda de afisare a cartilor
    public void showDetails(){
        if (books.isEmpty()){
            System.out.println("  There are no books in the library.");
        }
        else {
            for (Book book:
                 books) {
                System.out.println(book);
            }
        }
    }
}
