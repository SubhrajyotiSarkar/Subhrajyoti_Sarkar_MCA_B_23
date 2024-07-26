def divide(a, b):
    if b == 0:
        raise ZeroDivisionError("Division by zero")
    return a // b


def throw_example():
    raise ValueError("This exception is thrown intentionally.")


def main():
    try:
        result = divide(10, 0)
        print(f"Result: {result}")
    except ZeroDivisionError as e:
        print(f"Exception occurred: {str(e)}")
    finally:
        print("This block always executes.")

    throw_example()


if __name__ == "__main__":
    main()
