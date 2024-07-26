class NegativeAgeException(Exception):
    pass


def validate_age(age):
    if age < 0:
        raise NegativeAgeException("Age cannot be negative.")


def main():
    name = input("Enter name: ")

    while True:
        try:
            age = int(input("Enter age: "))
            validate_age(age)
            print(f"Name: {name}")
            print(f"Age: {age}")
            break
        except NegativeAgeException as e:
            print(str(e))
        except ValueError:
            print("Invalid input. Please enter a numeric value for age.")


if __name__ == "__main__":
    main()
