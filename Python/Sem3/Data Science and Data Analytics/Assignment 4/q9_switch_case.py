import re


s = input("Enter String: ")
print("1. Reverse It")
print("2. Palindrome Check")
print("3. Check if it end with a specific substring")
print("4. Capitalize the First Letter of Each Word")
print("5. Check if the String is Anagram of Another String")
print("6. Remove Vowels")
print("7. Length of the Longest Word in the Sentence")
ch = int(input("Enter Choice: "))

match ch:
    case 1:
        print(f"Reverse of String is: {s[::-1]}")
    case 2:
        if s == s[::-1]:
            print("The String is Palindrome")
        else:
            print("The String is Not Palindrome")
    case 3:
        temp = input("Enter Substring: ")
        if s.endswith(temp):
            print("The String ends with the Substring")
        else:
            print("The String does NOT end with the Substring")
    case 4:
        print(f"Every Word in Capital: {s.title()}")
    case 5:
        temp = input("Enter Another String: ")
        if len(s) != len(temp):
            print("The Strings are NOT Anagrams")
        else:
            ar = [0] * 26
            s = s.lower()
            temp = temp.lower()
            for i in s:
                ar[ord(i) - 97] += 1
            for i in temp:
                ar[ord(i) - 97] -= 1
            flag = 0
            for i in range(26):
                if ar[i] != 0:
                    print("The Strings are NOT Anagrams")
                    flag = 1
                    break
            if not flag:
                print("The Strings ARE Anagrams")
    case 6:
        res = ""
        vowels = "aeiouAEIOU"
        for i in s:
            if i not in vowels:
                res += i
        print(f"String Without Vowels: {res}")
    case 7:
        temp = re.split(r"[.,:;\'\"!\s]", s)
        res = ""
        lw = 0
        for i in temp:
            if len(i) > lw:
                lw = len(i)
                res = i
        print(f"Longest Word in String: {res}")
