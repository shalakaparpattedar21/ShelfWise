import java.util.*;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void viewBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public void searchBook(String keyword) {
        for (Book b : books) {
            if (b.title.contains(keyword) || b.author.contains(keyword)) {
                b.display();
            }
        }
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id && b.isAvailable) {
                b.isAvailable = false;
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id && !b.isAvailable) {
                b.isAvailable = true;
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid return.");
    }
}
