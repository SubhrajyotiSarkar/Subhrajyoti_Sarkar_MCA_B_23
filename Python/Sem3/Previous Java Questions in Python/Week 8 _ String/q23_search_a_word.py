str = input("Enter String: ")
word = input("Enter Word: ")

index = str.find(word)

if index != -1:
    print(f"Found at: {index}")
else:
    print("Not found")
