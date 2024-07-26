import time

str1 = input("Enter a String: ")
str2 = input("Enter another String: ")

start_time1 = time.time_ns()
is_equal1 = str1 == str2
end_time1 = time.time_ns()
execution_time1 = end_time1 - start_time1

start_time2 = time.time_ns()
comparison_result = (str1 > str2) - (str1 < str2)
is_equal2 = comparison_result == 0
end_time2 = time.time_ns()
execution_time2 = end_time2 - start_time2

print("Method 1 (==):")
print(f"Strings are equal: {is_equal1}")
print(f"Execution time: {execution_time1} nanoseconds\n")

print("Method 2 (comparison):")
print(f"Strings are equal: {is_equal2}")
print(f"Execution time: {execution_time2} nanoseconds")
