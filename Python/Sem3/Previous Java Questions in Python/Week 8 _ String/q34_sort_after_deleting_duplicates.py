def sort_unique(string):
    unique_chars = set()
    sb = []
    for ch in string:
        if ch != " " and ch not in unique_chars:
            sb.append(ch)
            unique_chars.add(ch)
    return "".join(sorted(sb))


str = input("Enter String: ")
sorted_str = sort_unique(str)
print(sorted_str)
