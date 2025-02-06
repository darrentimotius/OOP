public class Book {
    String title;
    String isbn;
    Author author;

    Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    String getIsbn() {
        return isbn;
    }

    Author getAuthor() {
        return author;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author.getName());
        System.out.println("Biography: " + author.getBiography());
        System.out.println("------------------------");
    }
}
