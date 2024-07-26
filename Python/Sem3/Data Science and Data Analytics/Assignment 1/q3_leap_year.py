y = int(input("Enter Year: "))
if not y % 4:
    if not y % 100:
        if not y % 400:
            print("Leap Year")
        else:
            print("Not a Leap Year")
    else:
        print("Leap Year")
else:
    print("Not a Leap Year")
