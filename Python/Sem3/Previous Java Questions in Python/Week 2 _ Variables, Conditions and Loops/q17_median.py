n = int(input("Enter Length of Array: "))
ar = []
print("Enter Array Elements: ")
for i in range(n):
    ar.append(int(input()))

ar.sort()
if n % 2:
    print(f"Median: {ar[n//2]}")
else:
    print(f"Median: {(ar[n//2-1] + ar[n//2])/2}")
