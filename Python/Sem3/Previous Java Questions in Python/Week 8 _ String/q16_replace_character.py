str = input("Enter a string : ")

print("Enter an old and new char to change : ")
old = input()
new = input()

replaced_string = str.replace(old, new)

print(f"Original String: {str}")
print(f"Replaced String: {replaced_string}")
