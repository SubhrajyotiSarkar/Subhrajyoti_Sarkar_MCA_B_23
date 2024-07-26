class TooOlderException(Exception):
    pass


class TooYoungerException(Exception):
    pass


def validate_age(age):
    if age > 45:
        raise TooOlderException("Candidate is too old for the position.")
    elif age < 20:
        raise TooYoungerException("Candidate is too young for the position.")


def main():
    name = input("Enter candidate name: ")
    age = int(input("Enter candidate age: "))

    try:
        validate_age(age)
        print(f"Eligible candidate: {name}")
    except TooOlderException as e:
        print(f"Exception: {e}")
    except TooYoungerException as e:
        print(f"Exception: {e}")


if __name__ == "__main__":
    main()
