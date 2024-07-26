y = int(input("Enter Year: "))
if not y % 4:
    if not y % 100:
        if not y % 400:
            print(f"{y} is a Leap Year")
        else:
            print(f"{y} is not a Leap Year")
    else:
        print(f"{y} is a Leap Year")
else:
    print(f"{y} is not a Leap Year")
