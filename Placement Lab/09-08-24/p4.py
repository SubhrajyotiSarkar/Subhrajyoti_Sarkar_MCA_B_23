# https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1

from collections import defaultdict

def frequencyCount(arr, N, P):
    # code here
    d = defaultdict(int)
    for i in arr:
        d[i] += 1
    for i in range(N):
        if d[i + 1] != 0:
            arr[i] = d[i + 1]
        else:
            arr[i] = 0
    return arr
