n = int(input("Enter Number of Students: "))
print("Enter Student Ages: ")
arr = [int(input()) for _ in range(n)]

# 1
arr.sort()
minn = arr[0]
maxx = arr[-1]
print(f"Minimum Age: {minn}")
print(f"Maximum Age: {maxx}")

# 2
arr.append(minn)
arr.append(maxx)
print(f"New List: {arr}")
n += 2
arr.sort()

# 3
if n % 2:
    print(f"Median: {arr[(n+1)//2]}")
else:
    print(f"Median: {(arr[n//2] + arr[n//2+1])/2}")

# 4
avg = sum(arr) / n
print(f"Average Age: {avg}")

# 5
print(f"Range of Ages: {minn} - {maxx}")

# 6
print(f"Min - Average: {abs(minn-avg)}")
print(f"Max - Average: {abs(maxx-avg)}")
