class ArithmeticExceptionHandler(Exception):
    pass


def calculate_equation(X, Y, P, Q, Z, I):
    if Q == 0:
        raise ArithmeticExceptionHandler("Cannot divide by zero")
    if P % Q != 0:
        raise ArithmeticExceptionHandler("Invalid operation: Non-integer division")
    return X + Y * (P // Q) * Z - I


def main():
    try:
        X, Y, P, Q, Z, I = 10, 20, 30, 0, 40, 50
        result = calculate_equation(X, Y, P, Q, Z, I)
        print(f"The result of the equation is: {result}")
    except ArithmeticExceptionHandler as e:
        print(f"Arithmetic Exception Occurred: {e}")


if __name__ == "__main__":
    main()
