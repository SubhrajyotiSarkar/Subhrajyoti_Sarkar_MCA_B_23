s = input("Enter String: ")
a, d = 0, 0
for i in s:
    if i.isalpha():
        a += 1
    elif i.isdigit():
        d += 1

print(f"Letters: {a}")
print(f"Digits: {d}")
