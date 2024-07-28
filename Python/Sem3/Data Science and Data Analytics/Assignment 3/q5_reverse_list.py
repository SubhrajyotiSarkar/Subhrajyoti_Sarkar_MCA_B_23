def print_list(nums):
    for i in range(len(nums) - 1, -1, -1):
        print(nums[i], end=" ")


nums = []
print("Keep Entering anything you want (Enter 00 to Stop): ")
while True:
    a = input()
    if a != "00":
        nums.append(a)
    else:
        break

print("The Items in the List in Reverse Order: ")
print_list(nums)
