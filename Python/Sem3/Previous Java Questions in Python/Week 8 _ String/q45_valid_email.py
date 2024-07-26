import re


def is_valid_email(email):
    regex = (
        r"^[a-zA-Z0-9_+&*-]+(?:\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\.)+[a-zA-Z]{2,7}$"
    )
    return re.match(regex, email) is not None


def main():
    email = input("Enter an email address: ")
    if is_valid_email(email):
        print("The email address is valid.")
    else:
        print("The email address is not valid.")


if __name__ == "__main__":
    main()
