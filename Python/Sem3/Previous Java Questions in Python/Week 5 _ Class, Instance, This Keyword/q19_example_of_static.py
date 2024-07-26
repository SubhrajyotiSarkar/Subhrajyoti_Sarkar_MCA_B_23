class ExampleOfStatic:
    count = 0

    @staticmethod
    def counter():
        ExampleOfStatic.count += 1


if __name__ == "__main__":
    print(f"The Counter Now Shows 0: {ExampleOfStatic.count}")
    ExampleOfStatic.counter()
    print(f"The Counter Now Shows 1: {ExampleOfStatic.count}")
