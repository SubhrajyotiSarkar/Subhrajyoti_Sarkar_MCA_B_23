import re
from typing import Counter


s = input("Enter Sentences: ")
print(f"Length of the String is: {len(s)}")
lst = re.split(r"[.,:;!\'\"?\s]", s)
flag = 0
for i in range(len(lst)):
    if lst[i].lower() == "country":
        print(f"Index of 'Country' == {s.find(lst[i])}")
        flag = 1
        break
if not flag:
    print("'Country' is not present in these sentences")

c = Counter(lst)
del c[""]
print("Frequency of Words: ")
print(c)
