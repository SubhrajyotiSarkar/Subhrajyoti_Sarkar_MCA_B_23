def main():
    input_string = input("Enter a string : ")
    group = input("Enter group of words you want to count: ")
    count = input_string.count(group)
    print(f"This group of words has appeared {count} times in input string")


if __name__ == "__main__":
    main()
