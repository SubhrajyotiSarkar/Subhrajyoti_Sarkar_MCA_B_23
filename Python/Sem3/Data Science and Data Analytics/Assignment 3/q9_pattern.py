#    .
#   / \
#  /   \
# /_____\

n = int(input("Enter Number of Rows: "))
for i in range(n):
    spaces = " " * (n - i - 1)
    if i == 0:
        print(spaces + ".")
    elif i == n - 1:
        print("/" + "_" * (2 * i - 1) + "\\")
    else:
        print(spaces + "/" + " " * (2 * i - 1) + "\\")
