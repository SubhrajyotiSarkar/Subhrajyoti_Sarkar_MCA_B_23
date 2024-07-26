class NotPositiveException(Exception):
    pass


def check_number(number):
    if number <= 0:
        raise NotPositiveException("Number is not positive.")
    else:
        print(f"{number} is a positive number.")


def main():
    try:
        check_number(-5)
    except NotPositiveException as e:
        print(f"Caught Exception: {str(e)}")


if __name__ == "__main__":
    main()
