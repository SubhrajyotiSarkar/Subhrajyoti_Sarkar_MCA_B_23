import java.util.Scanner;

class MyClass {
    public MyClass() {
        System.out.println("0-argument constructor called");
    }
}

public class q24_zero_argument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating an object of MyClass using the 0-argument constructor
        MyClass obj = new MyClass();
String s;
System.out.println("enter any thing which you want to display");
s=scanner.next();
System.out.println("message which you entered: "+s);
        
        System.out.println("Object created successfully.");
        
        // Close the scanner
        scanner.close();
    }
}
