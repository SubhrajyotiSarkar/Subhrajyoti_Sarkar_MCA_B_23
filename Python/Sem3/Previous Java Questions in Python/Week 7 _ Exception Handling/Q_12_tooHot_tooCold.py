import sys


class TooHotException(Exception):
    pass


class TooColdException(Exception):
    pass


def check_temperature(celsius):
    if celsius > 35:
        raise TooHotException("Temperature is too hot!")
    elif celsius < 5:
        raise TooColdException("Temperature is too cold!")
    else:
        fahrenheit = (celsius * 9 / 5) + 32
        print("Normal temperature")
        print(f"Temperature in Fahrenheit: {fahrenheit:.2f}")


def main():
    if len(sys.argv) != 2:
        print(
            "Please provide a temperature value in Celsius as a command line argument."
        )
        return

    try:
        celsius = float(sys.argv[1])
    except ValueError:
        print("Invalid temperature format. Please enter a number.")
        return

    try:
        check_temperature(celsius)
    except TooHotException as e:
        print(f"Exception: {e}")
    except TooColdException as e:
        print(f"Exception: {e}")


if __name__ == "__main__":
    main()
