str = input("Enter String: ")
char_list = list(str)

is_word_start = True
for i in range(len(char_list)):
    if char_list[i].isalpha():
        if is_word_start:
            char_list[i] = char_list[i].upper()
            is_word_start = False
    else:
        is_word_start = True

modified_string = "".join(char_list)

print(f"Original String: {str}")
print(f"Modified String: {modified_string}")
