str = input("Enter string : ")
sub_str = input("Enter sub string : ")

x = str.rfind(sub_str)
if x == -1:
    print(f"{sub_str} is not in {str}")
else:
    print(f"Last Index of {sub_str} in {str} is: {x}")
