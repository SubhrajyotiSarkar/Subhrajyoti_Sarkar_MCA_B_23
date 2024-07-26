str = input("Enter a string : ")
word = input("Enter the word : ")

index = str.find(word)

if index != -1:
    print(f"Found at {index}")
else:
    print("Not found")
