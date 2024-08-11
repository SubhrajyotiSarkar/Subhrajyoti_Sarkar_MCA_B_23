# *******
# *** ***
# **   **
# *     *
# **   **
# *** ***
# *******

n = int(input("Enter Number of Rows (Odd Numbers Only): "))
count = 1
flag = 0
temp = (n - 1) // 2
copy = temp
for i in range(n):
    if i == 0 or i == n - 1:
        print("*" * n)
        continue
    if not flag:
        print("*" * temp + " " * count + "*" * temp)
        temp -= 1
        count += 2
        if i == copy:
            flag = 1
            temp = 2
            count -= 4
    else:
        print("*" * temp + " " * count + "*" * temp)
        count -= 2
        temp += 1
