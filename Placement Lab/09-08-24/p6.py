# https://www.geeksforgeeks.org/problems/minimum-sum-of-subarray/0

res=[]

t=int(input())
while t:
    n=int(input())
    arr=list(map(int, input().split()))
    minn=float('inf')
    count=1
    temp=[]
    while count<=n:
        for i in range(n-count+1):
            minn=min(minn, sum(arr[i:i+count]))
        temp.append(minn)
        count+=1
    t-=1
    temp=temp[::-1]
    res.append(temp[:])

for i in res:
    for j in i:
        print(j, end=" ")
    print()



# Optimal Solution
# #code 6
# class Solution:
#     def find_minimum_subarray_sum(self, arr):
#         N = len(arr)
#         result = [0] * N
        
#         min_ending_here = float('inf')
#         min_so_far = float('inf')
        
#         for i in range(N - 1, -1, -1):
#             if min_ending_here > 0:
#                 min_ending_here = arr[i]
#             else:
#                 min_ending_here += arr[i]
#             min_so_far = min(min_so_far, min_ending_here)
#             result[i] = min_so_far
        
#         return result

# if __name__ == "__main__":
#     import sys
#     input = sys.stdin.read
#     data = input().split()
    
#     index = 0
#     T = int(data[index])
#     index += 1
    
#     results = []
#     for _ in range(T):
#         N = int(data[index])
#         index += 1
#         arr = list(map(int, data[index:index + N]))
#         index += N
        
#         ob = Solution()
#         result = ob.find_minimum_subarray_sum(arr)
#         results.append(" ".join(map(str, result)))
    
#     for result in results:
#         print(result)
