a = int(input("Enter Number of Elements for First Array: "))

print("Enter First Array Elements: ")
ar = [int(input()) for _ in range(a)]
ar.sort()

b = int(input("Enter Number of Elements for Second Array: "))

print("Enter Second Array Elements: ")
arr = [int(input()) for _ in range(b)]
arr.sort()

res = [0 for _ in range(a + b)]
i, j, c = 0, 0, 0

while i < a and j < b:
    if ar[i] < arr[j]:
        res[c] = ar[i]
        i += 1
    else:
        res[c] = arr[j]
        j += 1
    c += 1

while i < a:
    res[c] = ar[i]
    c += 1
    i += 1

while j < b:
    res[c] = arr[j]
    c += 1
    j += 1

print(f"First Array: {ar}")
print(f"Second Array: {arr}")
print(f"Merged Array: {res}")
