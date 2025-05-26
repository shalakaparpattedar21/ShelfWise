public class Book {
    int id;
    String title, author;
    boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void display() {
        System.out.println(id + " | " + title + " | " + author + " | " + (isAvailable ? "Available" : "Issued"));
    }
}

