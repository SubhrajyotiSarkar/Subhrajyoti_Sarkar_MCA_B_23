def calculate_slope(x1, y1, x2, y2):
    return (y2 - y1) / (x2 - x1)


print("Enter Co-ordinates 1: ")
x1 = int(input())
y1 = int(input())
print("Enter Co-ordinates 2: ")
x2 = int(input())
y2 = int(input())
print("Slope =", calculate_slope(x1, y1, x2, y2))
