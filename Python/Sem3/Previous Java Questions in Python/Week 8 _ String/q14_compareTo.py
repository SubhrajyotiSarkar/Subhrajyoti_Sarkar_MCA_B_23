str1 = input("Enter Two Strings: ")
str2 = input()

result1 = (str1 > str2) - (str1 < str2)
result2 = (str2 > str1) - (str2 < str1)

print(f"str1.compareTo(str2): {result1}")
print(f"str2.compareTo(str1): {result2}")
