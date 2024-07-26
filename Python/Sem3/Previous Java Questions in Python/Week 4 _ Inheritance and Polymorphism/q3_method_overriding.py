class Animal:
    def sound(self):
        print("Animal makes a sound")


class Dog(Animal):
    def sound(self):
        print("Dog Barks")


class Cat(Animal):
    def sound(self):
        print("Cat Meows")


def main():
    print("Enter 'dog' and 'cat' to make its sound: ")
    a = input().lower()

    if a == "dog":
        ob = Dog()
    elif a == "cat":
        ob = Cat()
    else:
        print("Invalid Input. Please enter 'dog' and 'cat'")
        return

    ob.sound()


if __name__ == "__main__":
    main()
