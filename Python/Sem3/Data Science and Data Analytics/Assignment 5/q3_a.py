fruits = ("apple", "banana", "orange", "strawberry", "grape")
vegetables = ("carrot", "broccoli", "spinach", "tomato", "cucumber")
animal_products = ("milk", "eggs", "cheese", "yogurt", "beef")

# 1
food_stuff_tp = fruits + vegetables + animal_products
print(f"Food Stuff Set: {food_stuff_tp}")

# 2
food_stuff_lt = list(food_stuff_tp)
print(f"Food Stuff List: {food_stuff_lt}")

# 3
l = len(food_stuff_tp)
if l % 2:
    print(f"Middle Term: {food_stuff_tp[(l+1)//2]}")
else:
    print(f"Middle Terms: {food_stuff_tp[l//2]}, {food_stuff_tp[l//2+1]}")

# 4
print(f"First 3 Items: {food_stuff_lt[:3]}")
print(f"Last 3 Items: {food_stuff_lt[-3:]}")

# 5
del food_stuff_tp
