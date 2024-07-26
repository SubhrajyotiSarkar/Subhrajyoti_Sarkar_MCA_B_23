import sys


def main():
    try:
        if len(sys.argv) < 2:
            raise IndexError("No argument provided. Please enter an integer.")
        number = int(sys.argv[1])
        if number == 0:
            raise ValueError("Factorial of 0 is not allowed.")
        factorial = 1
        for i in range(1, number + 1):
            factorial *= i
        print(f"Factorial of {number} is: {factorial}")

    except IndexError as e:
        print(f"Error: {str(e)}")
    except ValueError as e:
        print(f"Error: {str(e)}")


if __name__ == "__main__":
    main()
