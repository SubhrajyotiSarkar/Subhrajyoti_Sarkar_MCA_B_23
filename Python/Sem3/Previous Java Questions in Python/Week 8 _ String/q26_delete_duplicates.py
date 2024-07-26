str = input("Enter String: ")

words = str.split()

unique_words = []
for word in words:
    if word not in unique_words:
        unique_words.append(word)

modified_string = " ".join(unique_words)

print(f"Original String: {str}")
print(f"String after removing duplicates: {modified_string}")
