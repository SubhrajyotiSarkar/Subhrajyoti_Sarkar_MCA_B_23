person = {
    "first_name": "Asabeneh",
    "last_name": "Yetayeh",
    "age": 250,
    "country": "Finland",
    "is_marred": True,
    "skills": ["JavaScript", "React", "Node", "MongoDB", "Python"],
    "address": {"street": "Space street", "zipcode": "02210"},
}


# 1
if "skills" in person:
    n = len(person["skills"])
    print(f"Middle Skill: {person['skills'][(n+1)//2]}")
else:
    print("There is no 'Skills' Key")

# 2
if "skills" in person:
    if "Python" in person["skills"]:
        print("\nYes Python is a Skill of this Person")
    else:
        print("\nNo Python is not a Skill of this Person")
else:
    print("\nThere are No Skills of this Person")

# 3
if (
    len(person["skills"]) == 2
    and "JavaScript" in person["skills"]
    and "React" in person["skills"]
):
    print("\nHe is a Front-End Developer")
elif (
    "Node" in person["skills"]
    and "Python" in person["skills"]
    and "MongoDB" in person["skills"]
):
    print("\nHe is a Backend Developer")
elif (
    "React" in person["skills"]
    and "Node" in person["skills"]
    and "MongoDB" in person["skills"]
):
    print("\nHe is a Full-Stack Developer")
else:
    print("\nUnknown Title")


# 4
if person["is_marred"] and person["country"] == "Finland":
    print("\nAsabeneh Yetayeh lives in Finland. He is married.")
