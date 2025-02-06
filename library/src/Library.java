import java.util.*;
public class Library {
    List <Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to library: " + book.getTitle());
    }

    void borrowBook(Borrower borrower, Book book) {
        books.remove(book);
        borrower.borrowBook(book);
        System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
    }

    void returnBook(Borrower borrower, Book book) {
        books.add(book);
        System.out.println(borrower.getName() + " returned " + book.getTitle());
    }

    void displayLibraryBooks() {
        System.out.println("Books in Library : ");
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
}
