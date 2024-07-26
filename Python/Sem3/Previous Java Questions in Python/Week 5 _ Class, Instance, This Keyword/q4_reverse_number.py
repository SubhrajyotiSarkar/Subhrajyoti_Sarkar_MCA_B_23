class Number:
    def __init__(self, num):
        self.num = num

    def reverse(self):
        n = 0
        num = self.num
        while num > 0:
            r = num % 10
            n = n * 10 + r
            num = num // 10
        print(f"Reverse Number: {n}")


if __name__ == "__main__":
    num = int(input("Enter a Number: "))
    obj = Number(num)
    obj.reverse()
