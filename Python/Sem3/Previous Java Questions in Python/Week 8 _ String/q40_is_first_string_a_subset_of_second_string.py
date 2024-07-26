def main():
    str1 = input("Enter the first string: ")
    str2 = input("Enter the second string: ")

    for char in str1:
        if char not in str2:
            print("String 1 is not a subset of String 2")
            return

    print("String 1 is a subset of String 2")


if __name__ == "__main__":
    main()
