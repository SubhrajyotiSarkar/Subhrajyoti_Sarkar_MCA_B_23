# https://www.geeksforgeeks.org/problems/kth-frequency-1611823641/0

from collections import Counter

res=[]
t=int(input())
temp=[]

while t:
    
    n,k = map(int, input().split())
    x=input().split()
    arr=[]
    for i in x:
        arr.append(int(i))
    d=Counter(arr)
    for key,v in d.items():
        if v>k:
            temp.append(key)
    temp.sort()
    if temp!=[]:
        res.append(temp[:])
        temp=[]
    else:
        res.append([-1])
    
    t-=1

for i in res:
    for j in i:
        print(j, end=" ")
    print()
