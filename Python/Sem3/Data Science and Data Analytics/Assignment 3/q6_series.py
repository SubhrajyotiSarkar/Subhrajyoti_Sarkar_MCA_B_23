n = int(input("Enter Number of Terms: "))
sums = 0
for i in range(1, n + 1):
    if i % 2:
        sums += 1 / i
    else:
        sums -= 1 / i

print(f"Result: {sums}")
