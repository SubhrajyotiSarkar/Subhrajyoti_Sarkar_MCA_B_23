def find_largest_smallest_words(string):
    if not string:
        print("String is empty.")
        return

    words = string.strip().split()
    if len(words) == 1:
        print(f"String contains only one word: {words[0]}")
        return

    largest_word = smallest_word = words[0]
    for word in words:
        if len(word) > len(largest_word):
            largest_word = word
        elif len(word) < len(smallest_word):
            smallest_word = word

    print(f"Largest word: {largest_word}")
    print(f"Smallest word: {smallest_word}")


str = input("Enter String: ")
find_largest_smallest_words(str)
