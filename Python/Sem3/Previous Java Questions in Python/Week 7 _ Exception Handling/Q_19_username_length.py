class InvalidCredentialsException(Exception):
    pass


VALID_USERNAME = "SubhrajyotiSarkar007"
VALID_PASSWORD = "Subhrajyoti Sarkar"


def authenticate(username, password):
    if len(username) < 6:
        raise InvalidCredentialsException(
            "Username must be at least 6 characters long."
        )

    if username != VALID_USERNAME or password != VALID_PASSWORD:
        raise InvalidCredentialsException("Invalid username or password.")


def main():
    username = input("Enter username: ")
    password = input("Enter password: ")

    try:
        authenticate(username, password)
        print("Authentication successful!")
    except InvalidCredentialsException as e:
        print(str(e))


if __name__ == "__main__":
    main()
