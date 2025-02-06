import java.util.*;
public class Borrower {
    String name;
    List <Book> borrowedBooks = new ArrayList<>();

    Borrower (String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    boolean returnBook(Book book) {
        return borrowedBooks.remove(book);
    }

    void displayBorrowedBooks() {
        System.out.println(name + " 's Borrowed Book: ");
        for (Book book : borrowedBooks) {
            book.displayBookInfo();
        }
    }

}
