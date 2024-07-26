class MyClass:
    def __init__(self):
        print("0-argument constructor called")


def main():
    obj = MyClass()

    s = input("Enter anything which you want to display: ")
    print("Message which you entered:", s)

    print("Object created successfully.")


if __name__ == "__main__":
    main()
