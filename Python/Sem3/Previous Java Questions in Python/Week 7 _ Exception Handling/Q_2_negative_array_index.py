def main():
    try:
        arr = [1, 2, 3]
        index = -1
        element = arr[index]
        print(f"Element at index {index}: {element}")
    except IndexError as e:
        print(f"IndexError occurred: {str(e)}")

    try:
        result = 5 / 0
        print(f"Result: {result}")
    except ZeroDivisionError as e:
        print(f"ZeroDivisionError occurred: {str(e)}")


if __name__ == "__main__":
    main()
