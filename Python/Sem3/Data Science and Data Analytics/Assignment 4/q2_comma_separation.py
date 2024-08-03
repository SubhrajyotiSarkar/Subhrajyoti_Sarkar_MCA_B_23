s = input("Enter Comma Separated Sequence: ")
lst = s.split(",")
lst.sort()
print("The Words in Sorted Order: ")
for i in range(len(lst)):
    if i != len(lst) - 1:
        print(lst[i], end=", ")
    else:
        print(lst[i])
