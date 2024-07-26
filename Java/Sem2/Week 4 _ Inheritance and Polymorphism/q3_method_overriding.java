import java.util.Scanner;

// Parent class
class Animal {
    // Method to make sound
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child class inheriting from Animal
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class q3_method_overriding {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 'dog' or 'cat' to hear the sound: ");
        String aype = sc.nextLine();

        // Creating object of Animal class
        Animal ob;

        // Depending on user input, create an object of Dog or Cat class
        if (aype.equalsIgnoreCase("dog")) {
            ob= new Dog(); // Dog object created
        } else if (aype.equalsIgnoreCase("cat")) {
            ob= new Cat(); // Cat object created
        } else {
            System.out.println("Invalid input. Please enter 'dog' or 'cat'.");
            return;
        }

        // Invoke makeSound method of the respective class
        ob.sound();

        sc.close();
    }
}
