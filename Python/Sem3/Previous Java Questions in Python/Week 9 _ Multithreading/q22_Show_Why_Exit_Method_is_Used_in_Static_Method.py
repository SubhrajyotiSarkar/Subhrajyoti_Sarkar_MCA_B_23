import sys


def my_static_method():
    print("Static method is executing...")
    sys.exit(0)


def main():
    print("Main method is executing...")
    my_static_method()


if __name__ == "__main__":
    main()
