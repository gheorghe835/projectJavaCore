package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    //Metoda de adaugare a cartii
    public void addBooks(Book book){
        books.add(book);
        System.out.println("  Carte adaugata:: " + book.getTitle());
    }

    //Metoda de imprumutare a cartilor
    public void borrowBook(String title){
        for (Book book:
             books) {
            if(book.getTitle().equalsIgnoreCase(title) & book.isStatus()){
                book.borrow();
                System.out.println("  Carte imprumutata:: " + title);
            }
            else {
                System.out.println("  Cartea la moment nu este disponibila sau nu exusta.");
            }
        }
    }
    //Metoda de returnare a cartilor
    public void returnBooks(String title){
        for (Book book:
             books) {
            if(book.getTitle().equalsIgnoreCase(title) & !book.isStatus()){
                book.returns();
                System.out.println("  Cartea returnata:: " + title);
                return;
            }
            else {
                System.out.println("  Cartea nu a fost imprumutata sau nu exista.");
            }
        }
    }

    //Metoda de afisare a cartilor
    public void showDetails(){
        if (books.isEmpty()){
            System.out.println("  Nu exista carti in bibliotaca.");
        }
        else {
            for (Book book:
                 books) {
                System.out.println(book);
            }
        }
    }
}
