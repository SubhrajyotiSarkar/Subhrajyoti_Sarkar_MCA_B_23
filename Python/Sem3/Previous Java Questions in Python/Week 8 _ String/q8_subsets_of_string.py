def find_subsets(string, k):
    subsets = []
    generate_subsets(string, 0, k, "", subsets)
    return subsets


def generate_subsets(string, index, k, current, subsets):
    if len(current) == k:
        subsets.append(current)
        return

    if index == len(string):
        return

    generate_subsets(string, index + 1, k, current + string[index], subsets)
    generate_subsets(string, index + 1, k, current, subsets)


input_string = input("Enter String: ")
k = int(input("Enter Length of Substring: "))
subsets = find_subsets(input_string, k)

print(f'Subsets of length {k} in the string "{input_string}":')
for subset in subsets:
    print(subset)
