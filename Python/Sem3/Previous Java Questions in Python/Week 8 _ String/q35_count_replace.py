def main():
    s = input("Enter String: ")
    char_count = {}

    for char in s:
        char_count[char] = char_count.get(char, 0) + 1

    for char in char_count:
        x = s.index(char)
        s = s[:x] + str(char_count[char]) + s[x + 1 :]

    print(s)


if __name__ == "__main__":
    main()
