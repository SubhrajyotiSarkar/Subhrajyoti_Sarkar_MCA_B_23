class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

class Library {
    private String[] availableBooks;

    public Library(String[] books) {
        this.availableBooks = books;
    }

    public void findBook(String bookName) throws BookNotFoundException {
        for (String book : availableBooks) {
            if (book.equalsIgnoreCase(bookName)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        throw new BookNotFoundException("BookNotFoundException: '" + bookName + "' does not exist in the library.");
    }
}

public class Q_17_library {
    public static void main(String[] args) {
        String[] books = {"The Alchemist", "The Da Vinci Code", "Harry Potter", "The Lord of the Rings"};
        Library library = new Library(books);

        try {
            library.findBook("The Da Vinci Code");
            library.findBook("The Great Gatsby"); 
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
