def main():
    str_input = input("Enter a String: ")
    word = input("Enter a word: ")

    index = str_input.rfind(word)

    print(index + 1)


if __name__ == "__main__":
    main()
