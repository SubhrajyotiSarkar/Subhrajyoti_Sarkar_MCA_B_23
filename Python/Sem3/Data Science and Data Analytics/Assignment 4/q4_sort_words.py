s = input("Enter Space Separated String: ")
lst = s.split()
lst = sorted(list(set(lst)))
print("After Removing Duplicates and Sorting: ")
for i in lst:
    print(i, end=" ")
