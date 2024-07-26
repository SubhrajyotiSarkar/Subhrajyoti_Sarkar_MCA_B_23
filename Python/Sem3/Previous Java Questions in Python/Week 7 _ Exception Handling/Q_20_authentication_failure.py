class AuthenticationFailureException(Exception):
    pass


CORRECT_PASSWORD = "Subhrajyotisarkar"


def authenticate(password):
    if password != CORRECT_PASSWORD:
        raise AuthenticationFailureException(
            "Authentication Failure: Incorrect password"
        )
    print("Authentication Successful")


def main():
    password = input("Enter password: ")

    try:
        authenticate(password)
    except AuthenticationFailureException as e:
        print(str(e))


if __name__ == "__main__":
    main()
