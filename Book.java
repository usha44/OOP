public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable = true;

    public void setTitle(String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getYear() {
        return year;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java Basics");
        book.setAuthor("Alice Smith");
        book.setYear(2022);
        book.borrowBook();

        System.out.println("Title: " + book.getTitle());
        System.out.println("Available: " + book.isAvailable());
    }
}
