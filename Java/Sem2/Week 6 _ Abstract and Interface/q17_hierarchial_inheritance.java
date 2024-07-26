interface Animal {
    void eat();
}
interface Mammal extends Animal {
    void walk();
}

interface Reptile extends Animal {
    void crawl();
}
class Dog implements Mammal {
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void walk() {
        System.out.println("Dog is walking.");
    }
}

class Snake implements Reptile {
    public void eat() {
        System.out.println("Snake is eating.");
    }

    public void crawl() {
        System.out.println("Snake is crawling.");
    }
}

public class q17_hierarchial_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Snake snake = new Snake();
        dog.eat();
        snake.eat();
        dog.walk();
        snake.crawl();
    }
}
