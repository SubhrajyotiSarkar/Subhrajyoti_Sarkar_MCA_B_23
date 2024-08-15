student = {}

student["First Name"] = "Subhrajyoti"
student["Last Name"] = "Sarkar"
student["Gender"] = "Male"
student["Age"] = 21
student["Marital Status"] = "Single"
student["Skills"] = ["Python", "Zoning Out :)"]
student["Country"] = "India"
student["City"] = "Kolkata"
student["Address"] = "Khardah"


# 1
print(f"Length of 'Student': {len(student)}")

# 2
print(f"\nType of 'Skills': {type(student['Skills'])}")

# 3
student["Skills"].extend(["Skill 1", "Skill 2"])
print(f"\nUpdated 'Skills': {student['Skills']}")

# 4
print(f"\n'Keys': {student.keys()}")

# 5
print(f"\n'Values': {student.values()}")

# 6
print(f"\n'Items': {student.items()}")

# 7
del student["City"]
print(f"\n'Items': {student.items()}")

# 8
del student
