class BookNotFoundException(Exception):
    pass


class Library:
    def __init__(self, books):
        self.available_books = books

    def find_book(self, book_name):
        for book in self.available_books:
            if book.lower() == book_name.lower():
                print(f"Book found: {book}")
                return
        raise BookNotFoundException(
            f"BookNotFoundException: '{book_name}' does not exist in the library."
        )


def main():
    books = [
        "The Alchemist",
        "The Da Vinci Code",
        "Harry Potter",
        "The Lord of the Rings",
    ]
    library = Library(books)

    try:
        library.find_book("The Da Vinci Code")
        library.find_book("The Great Gatsby")
    except BookNotFoundException as e:
        print(str(e))


if __name__ == "__main__":
    main()
