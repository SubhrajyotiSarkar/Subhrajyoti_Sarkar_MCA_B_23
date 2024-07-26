class WrongNumberFormatException(Exception):
    pass


def convert_binary_to_decimal(binary_string):
    decimal = 0
    base = 1

    for digit in reversed(binary_string):
        if digit not in "01":
            raise WrongNumberFormatException(
                "Invalid binary digit. Only '0' and '1' allowed."
            )

        digit_value = int(digit)
        decimal += digit_value * base
        base *= 2

    return decimal


def main():
    binary_string = input("Enter a binary number: ")

    try:
        decimal = convert_binary_to_decimal(binary_string)
        print(f"Decimal equivalent: {decimal}")
    except WrongNumberFormatException as e:
        print(f"Exception: {e}")


if __name__ == "__main__":
    main()
