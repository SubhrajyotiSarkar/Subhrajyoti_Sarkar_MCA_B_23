MAX_SIZE = 21

factorial_array = [1] * MAX_SIZE

for i in range(1, MAX_SIZE):
    factorial_array[i] = factorial_array[i - 1] * i


def compute_factorial(x):
    if x < 0:
        raise ValueError("Value of x must be positive")
    if x >= MAX_SIZE:
        raise ValueError("Result will overflow")
    return factorial_array[x]


def main():
    try:
        x = 21
        result = compute_factorial(x)
        print(f"Factorial of {x} is: {result}")
    except ValueError as e:
        print(f"Exception occurred: {str(e)}")


if __name__ == "__main__":
    main()
