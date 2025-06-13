
interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    String title, author;
    int year;
    boolean available;

    Book(String t, String a, int y, boolean av) {
        title = t; author = a; year = y; available = av;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return available; }
}

public class LibraryItemTest {
    public static void main(String[] args) {
        LibraryItem book = new Book("To Kill a Mockingbird", "Harper Lee", 1960, true);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + (book.isAvailable() ? "Yes" : "No"));
    }
}
