def isPrime(n):
    for i in range(2, n):
        if not n % i:
            return False
    return True


n = int(input("Enter Length of Array: "))
ar = [0 for _ in range(n)]
prime = 0

print("Enter Array Elements: ")
for i in range(n):
    ar[i] = int(input())
    if ar[i] != 1 and isPrime(ar[i]):
        prime += 1

print(f"Number of Prime Numbers in this Array: {prime}")
