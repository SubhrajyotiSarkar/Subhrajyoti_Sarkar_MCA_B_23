s = input("Enter String: ")
t = input("Enter Another String: ")
if s.lower() == t.lower():
    print(f"{s} and {t} are equal if we ignore the cases")
else:
    print(f"{s} and {t} are not equal")
