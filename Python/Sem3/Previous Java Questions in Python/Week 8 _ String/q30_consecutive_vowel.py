def find_consecutive_vowels(string):
    vowels = "aeiouAEIOU"
    for i in range(len(string) - 1):
        if string[i] in vowels and string[i + 1] in vowels:
            return f"{string[i]} and {string[i+1]} appear consecutively in this String"
    return "There are no Consecutive Vowels in this String"


str = input("Enter a string: ")
print("Consecutive vowel substrings:", find_consecutive_vowels(str))
