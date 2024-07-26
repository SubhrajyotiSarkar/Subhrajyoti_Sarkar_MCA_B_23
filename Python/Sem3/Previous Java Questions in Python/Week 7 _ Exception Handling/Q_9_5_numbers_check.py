import sys


class CheckArgument(Exception):
    pass


def main():
    try:
        if len(sys.argv) < 6:
            raise CheckArgument(
                "Insufficient arguments. Please provide at least 5 numbers."
            )
        sum_of_numbers = sum(int(arg) for arg in sys.argv[1:6])
        print(f"The sum of the first five numbers is: {sum_of_numbers}")

    except CheckArgument as e:
        print(f"Error: {str(e)}")
    except ValueError:
        print("Error: Please ensure all arguments are integers.")


if __name__ == "__main__":
    main()
