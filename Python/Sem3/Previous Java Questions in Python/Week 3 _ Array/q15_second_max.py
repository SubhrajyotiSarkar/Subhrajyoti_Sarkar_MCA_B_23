import heapq


n = int(input("Enter Size of Array: "))
ar = []
heapq.heapify(ar)
print("Enter Array Elements: ")
while n:
    if len(ar) == 2:
        heapq.heappushpop(ar, int(input()))
    else:
        heapq.heappush(ar, int(input()))
    n -= 1

print(f"Second Largest Element: {heapq.heappop(ar)}")
