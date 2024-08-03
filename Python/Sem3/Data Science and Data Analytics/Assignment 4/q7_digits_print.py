s = input("Enter String: ")
lst = s.split()
res = []
for i in lst:
    if i.isdigit():
        res.append(i)

print("Digit Array: ")
print(res)
