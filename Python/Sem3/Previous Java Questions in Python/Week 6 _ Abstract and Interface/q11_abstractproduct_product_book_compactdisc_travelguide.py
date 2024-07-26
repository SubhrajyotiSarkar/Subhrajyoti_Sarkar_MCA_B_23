from abc import ABC, abstractmethod


class AbstractProduct(ABC):
    def __init__(self, product_id, name, description):
        self.product_id = product_id
        self.name = name
        self.description = description

    @abstractmethod
    def display(self):
        pass


class Product(AbstractProduct):
    def display(self):
        print(f"Product ID: {self.product_id}")
        print(f"Name: {self.name}")
        print(f"Description: {self.description}")


class Book(Product):
    def __init__(self, product_id, name, description, isbn, author):
        super().__init__(product_id, name, description)
        self.isbn = isbn
        self.author = author

    def display(self):
        super().display()
        print(f"ISBN: {self.isbn}")
        print(f"Author: {self.author}")


class CompactDisc(Product):
    def __init__(self, product_id, name, description, artist, title):
        super().__init__(product_id, name, description)
        self.artist = artist
        self.title = title

    def display(self):
        super().display()
        print(f"Artist: {self.artist}")
        print(f"Title: {self.title}")


class TravelGuide(Book):
    def __init__(self, product_id, name, description, isbn, author, country):
        super().__init__(product_id, name, description, isbn, author)
        self.country = country

    def display(self):
        super().display()
        print(f"Country: {self.country}")


def main():
    print("Enter Travel Guide details:")
    product_id = input("Product ID: ")
    name = input("Name: ")
    description = input("Description: ")
    isbn = input("ISBN: ")
    author = input("Author: ")
    country = input("Country: ")

    travel_guide = TravelGuide(product_id, name, description, isbn, author, country)
    print("\nTravel Guide details:")
    travel_guide.display()


if __name__ == "__main__":
    main()
