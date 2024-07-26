class Complex:
    @staticmethod
    def f1():
        print("f1 method of the Complex class is executed.")


class Sample(Complex):
    @staticmethod
    def f1():
        print("f1 of the Sample class is executed.")


def main():
    print("1. Enter 1 to Execute f1 from Complex Class")
    print("2. Enter 2 to Execute f1 from Sample Class:")

    try:
        choice = int(input())
        if choice == 1:
            Complex.f1()
        elif choice == 2:
            Sample.f1()
        else:
            print("Invalid choice!")
    except ValueError:
        print("Invalid input. Please enter a number.")


if __name__ == "__main__":
    main()
