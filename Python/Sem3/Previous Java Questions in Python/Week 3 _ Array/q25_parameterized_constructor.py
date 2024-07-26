class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display_info(self):
        print("Name:", self.name)
        print("Age:", self.age)


def main():
    name = input("Enter name: ")
    age = int(input("Enter age: "))

    person = Person(name, age)

    print("\nPerson information:")
    person.display_info()


if __name__ == "__main__":
    main()
