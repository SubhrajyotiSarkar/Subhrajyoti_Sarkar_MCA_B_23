def check_char(string, index):
    return 0 <= index < len(string)


str = input("Enter String: ")
index = int(input("Enter Index: "))

if check_char(str, index):
    print(f"The character at index {index} is '{str[index]}'")
else:
    print(f"Character does not exist at index {index}")
