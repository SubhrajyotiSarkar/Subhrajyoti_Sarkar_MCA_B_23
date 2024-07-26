def calculate_factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * calculate_factorial(n - 1)


number = int(input("Enter a Number : "))
fact = calculate_factorial(number)
print(f"Factorial of {number} is: {fact}")
