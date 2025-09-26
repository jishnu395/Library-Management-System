import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void showBooks() {
        if(books.isEmpty()) {
            System.out.println("No books in library");
        }else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void issueBook (int bookId) {
        for (Book b : books) {
            if(b.getId() == bookId && !b.isIssued()) {
                b.issueBook();
                System.out.println("Book issued: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not available");
    }

    public void returnBook (int bookId) {
        for(Book b : books) {
            if(b.getId() == bookId && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned: " + b.getTitle());
                return;
            }
        }
        System.out.println("Invalid return attempt");
    }
}