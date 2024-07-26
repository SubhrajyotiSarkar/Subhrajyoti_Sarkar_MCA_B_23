def find_all_indices(text, search_value):
    indices = []
    start_index = 0
    while True:
        index = text.find(search_value, start_index)
        if index == -1:
            break
        indices.append(index)
        start_index = index + 1
    return indices


def main():
    str_input = input("Enter a String: ")
    ch = input("Enter the character: ")
    indices = find_all_indices(str_input, ch)

    print(" ".join(map(str, indices)))


if __name__ == "__main__":
    main()
