n = input("Enter a Number: ")
sums = 0
for i in range(len(n) - 1):
    curr = (ord(n[i]) - ord("0")) * 10 + (ord(n[i + 1]) - ord("0"))
    print(curr, end=" ")
    sums += curr

print(f"\nSum of numbers formed by consecutive digits: {sums}")
