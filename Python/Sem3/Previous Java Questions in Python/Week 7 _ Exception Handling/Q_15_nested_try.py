def main():
    try:
        numbers = [1, 2, 3]
        print("Before exception is generated.")

        try:
            print(numbers[5])
        except IndexError as e:
            print(f"Array index is out of bounds: {e}")

        print(5 / 0)
    except ZeroDivisionError as e:
        print(f"Division by zero: {e}")


if __name__ == "__main__":
    main()
