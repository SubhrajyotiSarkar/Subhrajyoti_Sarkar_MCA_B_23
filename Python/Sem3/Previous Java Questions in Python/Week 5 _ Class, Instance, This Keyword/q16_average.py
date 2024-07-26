class Average:
    def __init__(self):
        self.numbers = []

    def read_numbers(self):
        print("Enter ten numbers:")
        for _ in range(10):
            self.numbers.append(float(input()))

    def calculate_average_and_count_above(self):
        average = sum(self.numbers) / 10
        print(f"Average: {average}")

        count_above_average = sum(1 for num in self.numbers if num > average)
        print(f"Numbers above the average: {count_above_average}")


if __name__ == "__main__":
    obj = Average()
    obj.read_numbers()
    obj.calculate_average_and_count_above()
