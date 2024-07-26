def main():
    string = input("Enter a string: ")
    char = input("Enter a character to search for: ")[0]

    freq = 0
    positions = []
    for i, c in enumerate(string):
        if c == char:
            freq += 1
            positions.append(str(i + 1))

    print("Position(s) of occurrence:", " ".join(positions))
    print(f"freq of character '{char}': {freq}")


if __name__ == "__main__":
    main()
