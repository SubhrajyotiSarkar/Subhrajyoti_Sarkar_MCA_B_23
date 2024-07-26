from abc import ABC, abstractmethod


class Animal(ABC):
    @abstractmethod
    def make_sound(self):
        pass


class Dog(Animal):
    def make_sound(self):
        print("Dog barks: Woof! Woof!")


class Cat(Animal):
    def make_sound(self):
        print("Cat meows: Meow! Meow!")


if __name__ == "__main__":
    dog = Dog()
    cat = Cat()

    dog.make_sound()
    cat.make_sound()
