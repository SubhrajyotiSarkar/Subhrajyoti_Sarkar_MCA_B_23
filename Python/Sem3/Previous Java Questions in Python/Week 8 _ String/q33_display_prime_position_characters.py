def is_prime(pos):
    if pos < 2:
        return False
    for i in range(2, int(pos**0.5) + 1):
        if pos % i == 0:
            return False
    return True


str = input("Enter the string: ")

print("Characters at prime position : ")
prime_chars = [str[i] for i in range(2, len(str)) if is_prime(i)]
print(" ".join(prime_chars))
