from typing import Counter


n = int(input("Enter Number of Elements: "))
print("Enter Array Elements: ")
ar = [int(input()) for _ in range(n)]

hmap = Counter(ar)
print("The Elementts with Duplicates and theie Frequencies: ")
for i in hmap:
    if hmap[i] > 1:
        print(f"{i} ---> {hmap[i]}")
