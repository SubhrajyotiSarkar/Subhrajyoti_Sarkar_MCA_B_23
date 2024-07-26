class Tendor:
    def __init__(self, cost, name):
        self.cost = cost
        self.name = name


if __name__ == "__main__":
    cost = []
    name = []
    for i in range(5):
        cost.append(int(input(f"Enter Cost {i + 1}: ")))
        name.append(input(f"Enter Name {i + 1}: "))

    min_cost = float("inf")
    min_name = ""
    for i in range(5):
        obj = Tendor(cost[i], name[i])
        if min_cost > obj.cost:
            min_cost = obj.cost
            min_name = obj.name

    print(f"\nMinimum Cost: {min_cost}")
    print(f"Company Name: {min_name}")
