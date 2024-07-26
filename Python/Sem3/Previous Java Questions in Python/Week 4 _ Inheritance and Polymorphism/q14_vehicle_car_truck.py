class Vehicle:
    def __init__(self, number_of_wheels, speed):
        self.number_of_wheels = number_of_wheels
        self.speed = speed

    def display_info(self):
        print(f"Number of Wheels: {self.number_of_wheels}")
        print(f"Speed: {self.speed} mph")


class Car(Vehicle):
    def __init__(self, number_of_wheels, speed, number_of_passengers):
        super().__init__(number_of_wheels, speed)
        self.number_of_passengers = number_of_passengers

    def display_info(self):
        super().display_info()
        print(f"Number of Passengers: {self.number_of_passengers}")


class Truck(Vehicle):
    def __init__(self, number_of_wheels, speed, load_limit):
        super().__init__(number_of_wheels, speed)
        self.load_limit = load_limit

    def display_info(self):
        super().display_info()
        print(f"Load Limit: {self.load_limit} tons")


def main():
    print("Enter information for Car:")
    car_wheels = int(input("Number of Wheels: "))
    car_speed = float(input("Speed (mph): "))
    car_passengers = int(input("Number of Passengers: "))
    car = Car(car_wheels, car_speed, car_passengers)

    print("\nEnter information for Truck:")
    truck_wheels = int(input("Number of Wheels: "))
    truck_speed = float(input("Speed (mph): "))
    truck_load_limit = float(input("Load Limit (tons): "))
    truck = Truck(truck_wheels, truck_speed, truck_load_limit)

    print("\nCar Information:")
    car.display_info()
    print("\nTruck Information:")
    truck.display_info()

    print("\nComparison:")
    if car.speed > truck.speed:
        print("The car is faster than the truck.")
    elif car.speed < truck.speed:
        print("The truck is faster than the car.")
    else:
        print("Both car and truck have the same speed.")


if __name__ == "__main__":
    main()
