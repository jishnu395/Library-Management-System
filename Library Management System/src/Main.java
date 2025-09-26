import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner s = new Scanner(System.in);

        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(3, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(4, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(5, "1984", "George Orwell"));

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Books");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your Choice: ");
            choice = s.nextInt();

            switch(choice){
                case 1 -> library.showBooks();
                case 2 -> {
                    System.out.println("Enter Book ID to issue: ");
                    int id = s.nextInt();
                    library.issueBook(id);
                }
                case 3 -> {
                    System.out.println("Enter Book ID to return: ");
                    int id = s.nextInt();
                    library.returnBook(id);
                }
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        }while (choice != 4);
        s.close();
    }
}