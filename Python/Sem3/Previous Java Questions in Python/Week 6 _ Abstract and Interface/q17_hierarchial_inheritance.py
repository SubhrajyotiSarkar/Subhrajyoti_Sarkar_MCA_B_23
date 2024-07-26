from abc import ABC, abstractmethod


class Animal(ABC):
    @abstractmethod
    def eat(self):
        pass


class Mammal(Animal):
    @abstractmethod
    def walk(self):
        pass


class Reptile(Animal):
    @abstractmethod
    def crawl(self):
        pass


class Dog(Mammal):
    def eat(self):
        print("Dog is eating.")

    def walk(self):
        print("Dog is walking.")


class Snake(Reptile):
    def eat(self):
        print("Snake is eating.")

    def crawl(self):
        print("Snake is crawling.")


def main():
    dog = Dog()
    snake = Snake()
    dog.eat()
    snake.eat()
    dog.walk()
    snake.crawl()


if __name__ == "__main__":
    main()
