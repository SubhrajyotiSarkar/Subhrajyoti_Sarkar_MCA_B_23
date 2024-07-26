n = int(input("Enter Number of Elements: "))
ar = [0 for _ in range(n)]
nz = 0

print("Enter Array Elements: ")
for i in range(n):
    ar[i] = int(input())
    if ar[i]:
        nz += 1

print(f"Number of Non-Zero Numbers: {nz}")
