A = {19, 22, 24, 20, 25, 26}
B = {19, 22, 20, 25, 26, 24, 28, 27}

# 1
C = A.copy()
C.update(B)
print(f"A join B: {C}")

# 2
D = A.intersection(B)
print(f"\nA Intersection B: {D}")

# 3
print(f"\nIs A a Subset of B?: {A.issubset(B)}")

# 4
print(f"\nAre A and B Disjoint?: {A.isdisjoint(B)}")

# 5
a1 = A.copy()
a2 = A.copy()
b1 = B.copy()
b2 = B.copy()
a1.update(b1)
print(f"\nA joined with B: {a1}")
b2.update(a2)
print(f"B joined with A: {b2}")

# 6
print(f"\nSymmetric Difference between A and B: {A.symmetric_difference(B)}")

# 7
del A, B
