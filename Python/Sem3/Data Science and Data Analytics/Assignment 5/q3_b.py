it_companies = {"Facebook", "Google", "Microsoft", "Apple", "IBM", "Oracle", "Amazon"}

# 1
print(f"Length of It_Companies: {len(it_companies)}")

# 2
it_companies.add("Twitter")
print(f"\nNew Set: {it_companies}")

# 3
new_companies = {"Netflix", "Tesla", "NVIDIA", "Adobe", "Salesforce"}
it_companies.update(new_companies)
print(f"\nUpdated It_Companies: {it_companies}")

# 4
it_companies.remove("Facebook")
print(f"\nNew It_Companies: {it_companies}")

# 5
# 'remove' is a keyword used to delete an item from a list or a set.
# 'discard' is a keyword used to delete an item from set only.
# both return nothing.

# If we try to remove some item that is not present in the set, then it will raise 'KeyError'.
# But if we try to discard an item that is not present in the set, then it will raise to error.

# Example

# a={1,2,3}
# a.remove(1) # 1 is removed without error
# print(a) # a = {2,3}
# a.remove(1) # KeyError is raised

# a={4,5,6}
# a.discard(5) # 5 is removed without error
# print(a) # a = {4,6}
# a.discard(5) # nothing happens as 5 is not present in a
# print(a) # a = {4,6}
