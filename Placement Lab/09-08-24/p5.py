# https://www.geeksforgeeks.org/problems/convert-an-array-to-reduced-form1101/1


def convert(self, arr, n):
    # code here
    temp = sorted(arr)

    hmap = {value: index for index, value in enumerate(temp)}

    for i in range(n):
        arr[i] = hmap[arr[i]]
