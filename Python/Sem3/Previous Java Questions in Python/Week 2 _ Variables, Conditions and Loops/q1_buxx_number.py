n = int(input("Enter Number: "))
if n % 10 == 7 or not n % 7:
    print(f"{n} is a Buzz Number")
else:
    print(f"{n} is not a Buzz Number")
