#    *
#   * *
#  *   *
# *     *
#  *   *
#   * *
#    *


n = int(input("Enter Number of Rows (Odd Numbers only): "))
flag = 0
r = 0
i = (n + 1) // 2 - 1
count = 0
while r < n:
    if not flag:
        print(" " * i, end="")
        i -= 1
        if i == -1:
            flag = 1
            i = 1
        if count:
            print("*" + " " * count + "*")
            count += 2
            if flag:
                count -= 4
        else:
            print("*")
            count = 1
    else:
        print(" " * i, end="")
        i += 1
        if count > 0:
            print("*" + " " * count + "*")
            count -= 2
        else:
            print("*")
    r += 1
