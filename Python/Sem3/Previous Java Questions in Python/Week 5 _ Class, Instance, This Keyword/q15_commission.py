import calendar
import math


def commission(amount, rate):
    print(f"Commission: {amount * rate // 100}")


def display_month(y, m):
    cal = calendar.monthcalendar(y, m)
    print("\n---------------------------")
    print("Sun Mon Tue Wed Thu Fri Sat")
    print("---------------------------")
    for week in cal:
        print(" ".join(f"{day:3}" if day != 0 else "   " for day in week))
    print("---------------------------")


def root(n):
    print(f"Square Root of {n}: {math.sqrt(n)}")


def even(n):
    print("TRUE" if n % 2 == 0 else "FALSE")


def print_message(n, s):
    for _ in range(n):
        print(s)


def loan(amount, rate, time):
    rate = rate / 12 / 100
    time = time * 12
    monthly = amount * rate * (1 + rate) ** time / ((1 + rate) ** time - 1)
    print(f"Monthly Payment: {monthly}")


if __name__ == "__main__":
    print(
        "1. Commission\n2. Calendar\n3. Square Root\n4. Even Check\n5. Message Spam\n6. Monthly Payment"
    )
    ch = int(input("Enter Choice: "))

    if ch == 1:
        amount = int(input("Enter Amount: "))
        rate = int(input("Enter Rate: "))
        commission(amount, rate)
    elif ch == 2:
        m = int(input("Enter Month between 1 and 12: "))
        y = int(input("Enter a Full Year: "))
        display_month(y, m)
    elif ch == 3:
        n = int(input("Enter Number: "))
        root(n)
    elif ch == 4:
        n = int(input("Enter Number: "))
        even(n)
    elif ch == 5:
        n = int(input("Enter Number: "))
        s = input("Enter Message: ")
        print_message(n, s)
    elif ch == 6:
        amt = float(input("Enter Loan Amount: "))
        r = float(input("Enter Rate: "))
        time = int(input("Enter Time: "))
        loan(amt, r, time)
