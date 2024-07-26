count = 0


def print_reverse(n):
    global count
    if count == 10:
        return
    else:
        count += 1
        num = int(input("Enter a Number: "))
        print_reverse(num)
        print(num, end=" ")


if __name__ == "__main__":
    n = int(input("Enter a Number: "))
    print_reverse(n)
    print()
