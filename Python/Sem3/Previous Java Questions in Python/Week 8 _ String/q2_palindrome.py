class Palindrome:
    def __init__(self, s):
        self.str = s

    def is_palindrome(self, str):
        left = 0
        right = len(str) - 1
        while left < right:
            if str[left] != str[right]:
                return False
            left += 1
            right -= 1
        return True


name = input("Enter a string : ")
pd = Palindrome(name)

if pd.is_palindrome(name):
    print("Palindrome")
else:
    print("Not Palindrome")
