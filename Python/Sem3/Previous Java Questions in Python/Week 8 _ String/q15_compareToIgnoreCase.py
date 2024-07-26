print("Enter 2 Strings: ")
str1 = input()
str2 = input()

result1 = (str1.lower() > str2.lower()) - (str1.lower() < str2.lower())
result2 = (str2.lower() > str1.lower()) - (str2.lower() < str1.lower())

print(f"str1.compareToIgnoreCase(str2): {result1}")
print(f"str2.compareToIgnoreCase(str1): {result2}")
