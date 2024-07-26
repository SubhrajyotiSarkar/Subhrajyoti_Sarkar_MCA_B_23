import java.util.Scanner;

abstract class AbstractProduct {
    protected String productId;
    protected String name;
    protected String description;

    public AbstractProduct(String productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description;
    }

    public abstract void display();
}

class Product extends AbstractProduct {
    public Product(String productId, String name, String description) {
        super(productId, name, description);
    }

    @Override
    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }
}

class Book extends Product {

    private String isbn;
    private String author;

    public Book(String productId, String name, String description, String isbn, String author) {
        super(productId, name, description);
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
    }
}

class CompactDisc extends Product {
    private String artist;
    private String title;

    public CompactDisc(String productId, String name, String description, String artist, String title) {
        super(productId, name, description);
        this.artist = artist;
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
    }
}

class TravelGuide extends Book {
    private String country;

    public TravelGuide(String productId, String name, String description, String isbn, String author, String country) {
        super(productId, name, description, isbn, author);
        this.country = country;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Country: " + country);
    }
}

public class q11_abstractproduct_product_book_compactdisc_travelguide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Travel Guide details:");
        System.out.print("Product ID: ");
        String productId = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Description: ");
        String description = sc.nextLine();
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Country: ");
        String country = sc.nextLine();
        TravelGuide travelGuide = new TravelGuide(productId, name, description, isbn, author, country);
        System.out.println("\nTravel Guide details:");
        travelGuide.display();

        sc.close();
    }
}
