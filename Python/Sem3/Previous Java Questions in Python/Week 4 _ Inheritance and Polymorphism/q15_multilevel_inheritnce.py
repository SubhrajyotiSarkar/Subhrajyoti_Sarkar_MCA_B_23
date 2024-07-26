class Animal:
    def eat(self):
        print("Animal is eating...")


class Dog(Animal):
    def bark(self):
        print("Dog is barking...")


class Labrador(Dog):
    def color(self):
        print("Labrador is brown in color.")


def main():
    print("Which animal do you want to create?")
    print("1. Animal")
    print("2. Dog")
    print("3. Labrador")
    choice = int(input("Enter your choice: "))

    if choice == 1:
        animal = Animal()
        animal.eat()
    elif choice == 2:
        dog = Dog()
        dog.eat()
        dog.bark()
    elif choice == 3:
        labrador = Labrador()
        labrador.eat()
        labrador.bark()
        labrador.color()
    else:
        print("Invalid choice!")


if __name__ == "__main__":
    main()
