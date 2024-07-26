class StringMismatchException(Exception):
    pass


def compare_strings(str1, str2):
    if str1.lower() != str2.lower():
        raise StringMismatchException("The strings do not match.")
    else:
        print("The strings match.")


def main():
    string1 = input("Enter the first string: ")
    string2 = input("Enter the second string: ")

    try:
        compare_strings(string1, string2)
    except StringMismatchException as e:
        print(f"Caught Exception: {str(e)}")


if __name__ == "__main__":
    main()
