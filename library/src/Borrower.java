import java.util.*;

public class Borrower {
    private String name;
    private List <Book> borrowedBooks = new ArrayList<>();

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
        System.out.println(name + "'s Borrowed Books: ");
        for (Book book : borrowedBooks) {
            book.displayBookInfo();
        }
    }
}
