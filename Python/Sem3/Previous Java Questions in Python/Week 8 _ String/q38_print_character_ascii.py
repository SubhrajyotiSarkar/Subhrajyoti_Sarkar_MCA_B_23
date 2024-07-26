def main():
    str_input = input("Enter String: ")

    for char in str_input:
        ascii_value = ord(char)
        print(f"Character: {char}, ASCII: {ascii_value}")


if __name__ == "__main__":
    main()
