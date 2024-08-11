# https://www.geeksforgeeks.org/problems/adding-ones3628/1

# my code

# for i in updates:
#     for j in range(i-1,n):
#         a[j]+=1
# return a


# answer


def update(a, n, updates, k):
    changes = [0] * (n + 1)

    for i in updates:
        changes[i - 1] += 1

    current_sum = 0
    for i in range(n):
        current_sum += changes[i]
        a[i] += current_sum
    return a
