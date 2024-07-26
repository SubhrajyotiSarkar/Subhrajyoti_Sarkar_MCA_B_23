def main():
    method_name = input("Enter a Method Name: ")

    if hasattr(str, method_name):
        print(f"The method '{method_name}' exists in the str class.")
    else:
        print(f"The method '{method_name}' does not exist in the str class.")


if __name__ == "__main__":
    main()
