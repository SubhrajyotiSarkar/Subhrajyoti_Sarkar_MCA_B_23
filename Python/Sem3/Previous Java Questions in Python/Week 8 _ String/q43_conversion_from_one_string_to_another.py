def main():
    print("Enter two strings:")
    src = input().lower()
    dest = input().lower()

    char_count = [0] * 26

    for char in src:
        char_count[ord(char) - ord("a")] -= 1

    for char in dest:
        char_count[ord(char) - ord("a")] += 1

    changes = sum(abs(count) for count in char_count)

    print(f"Characters to be changed: {changes}")


if __name__ == "__main__":
    main()
