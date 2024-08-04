import re
from typing import Counter


s = input("Enter Sentences: ")
print(f"Length of the String is: {len(s)}")
lst = re.findall(r"\w+", s)
country = s.lower().find("country")
if country != -1:
    print(f"'Country' is in Index: {country}")
else:
    print("'Country' is not in this String")
c = Counter(lst)
print("Frequency of Words: ")
print(c)
