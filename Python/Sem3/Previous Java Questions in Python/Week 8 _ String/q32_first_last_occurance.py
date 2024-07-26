str = input("Enter String: ")
ch = input("Enter the character : ")

first_index = str.find(ch)
last_index = str.rfind(ch)

print(f"First index : {first_index}, Last index : {last_index}")
