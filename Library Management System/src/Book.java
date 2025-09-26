public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.isIssued = false;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        this.isIssued = true;
    }
    public void returnBook() {
        this.isIssued = false;
    }

    @Override
    public String toString() {
        return id + " - " + title + " by " + author + (isIssued ? "[Issued]" : " [Available]");
    }
}

