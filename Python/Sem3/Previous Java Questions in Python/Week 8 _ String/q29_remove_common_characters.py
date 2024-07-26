def remove_chars(str1, str2):
    char_set = set(str1)
    return "".join(c for c in str2 if c not in char_set)


str1 = input("Enter two Strings: ")
str2 = input()
result = remove_chars(str1, str2)

print(f"Original String (First): {str1}")
print(f"Original String (Second): {str2}")
print(f"String after removing characters: {result}")
