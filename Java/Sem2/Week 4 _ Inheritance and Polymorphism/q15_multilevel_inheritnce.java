import java.util.*;

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking...");
    }
}

class Labrador extends Dog {
    public void color() {
        System.out.println("Labrador is brown in color.");
    }
}

public class q15_multilevel_inheritnce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which animal do you want to create?");
        System.out.println("1. Animal");
        System.out.println("2. Dog");
        System.out.println("3. Labrador");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Animal animal = new Animal();
                animal.eat();
                break;
            case 2:
                Dog dog = new Dog();
                dog.eat();
                dog.bark();
                break;
            case 3:
                Labrador labrador = new Labrador();
                labrador.eat();
                labrador.bark();
                labrador.color();
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
