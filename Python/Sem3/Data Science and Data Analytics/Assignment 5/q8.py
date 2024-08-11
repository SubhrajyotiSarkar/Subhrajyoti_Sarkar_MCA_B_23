d = {
    ("december", "january", "february"): "Winter",
    ("march", "april", "may"): "Spring",
    ("june", "july", "august"): "Summer",
    ("september", "october", "november"): "Autumn",
}

a = input("Enter Month: ").lower()
flag = 0
for k, v in d.items():
    if not flag and a in k:
        print(v)
        flag = 1

if not flag:
    print("Enter Valid Month")
