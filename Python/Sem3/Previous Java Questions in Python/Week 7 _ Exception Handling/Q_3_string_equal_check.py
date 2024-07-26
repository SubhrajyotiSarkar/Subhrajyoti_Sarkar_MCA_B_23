class NoMatchFoundException(Exception):
    pass


def check_string(input_str):
    if input_str != "University":
        raise NoMatchFoundException("Input string does not match 'University'")


def main():
    input_str = input("Enter a string: ")

    try:
        check_string(input_str)
        print("Match found!")
    except NoMatchFoundException as e:
        print(str(e))


if __name__ == "__main__":
    main()
