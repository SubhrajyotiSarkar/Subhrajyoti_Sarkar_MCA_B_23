# https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?category%5B%5D=Arrays&category%5B%5D=Arrays&page=1&query=category%5B%5DArrayspage1category%5B%5DArrays


def get_min_max(arr):
    arr = sorted(list(set(arr)))
    return [arr[0], arr[-1]]
