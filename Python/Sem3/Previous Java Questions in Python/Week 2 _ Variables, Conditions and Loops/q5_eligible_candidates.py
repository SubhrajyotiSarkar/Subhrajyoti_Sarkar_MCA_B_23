n = int(input("Enter Number of Candidates: "))
res, ar = [], []
print("Enter Marks for All Candidates: ")
for _ in range(n):
    for _ in range(3):
        ar.append(int(input()))
    res.append(ar[:])
    ar = []

print(res)

for i in range(n):
    if (
        res[i][0] >= 60
        and res[i][1] >= 50
        and res[i][2] >= 40
        and (sum(res[i]) >= 200 or (res[i][0] + res[i][1]) >= 150)
    ):
        print(f"Student {i+1} is Eligible")
