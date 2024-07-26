from collections import Counter


def main():
    input_string = input("Enter a string: ").lower()

    print("Occurrences of each character (ignoring case):")
    char_count = Counter(input_string)
    print(dict(char_count))


if __name__ == "__main__":
    main()
