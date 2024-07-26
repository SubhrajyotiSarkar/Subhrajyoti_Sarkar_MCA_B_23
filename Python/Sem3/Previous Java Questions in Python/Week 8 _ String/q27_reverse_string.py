def reverse_iteration(s):
    return s[::-1]


def reverse_recursion(s):
    if not s:
        return s
    else:
        return reverse_recursion(s[1:]) + s[0]


str = input("Enter a string : ")

str_reverse_iteration = reverse_iteration(str)
str_reverse_recursion = reverse_recursion(str)

print(f"Iteration : {str_reverse_iteration}")
print(f"Recursion : {str_reverse_recursion}")
