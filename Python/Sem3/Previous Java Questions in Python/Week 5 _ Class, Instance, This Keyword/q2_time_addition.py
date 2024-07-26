class Time:
    def __init__(self, hour, min, sec):
        self.hour = hour
        self.min = min
        self.sec = sec

    def add(self, o):
        hour = self.hour + o.hour
        min = self.min + o.min
        sec = self.sec + o.sec

        min += sec // 60
        sec %= 60
        hour += min // 60
        min %= 60

        print(f"Added Time: {hour} hr {min} min {sec} sec")


if __name__ == "__main__":
    h1 = int(input("Enter First Hour: "))
    m1 = int(input("Enter First Minute: "))
    s1 = int(input("Enter First Second: "))
    h2 = int(input("Enter Second Hour: "))
    m2 = int(input("Enter Second Minute: "))
    s2 = int(input("Enter Second Second: "))
    obj1 = Time(h1, m1, s1)
    obj2 = Time(h2, m2, s2)
    obj1.add(obj2)
