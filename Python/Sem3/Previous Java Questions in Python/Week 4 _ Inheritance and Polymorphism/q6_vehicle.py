class Vehicle:
    def __init__(self, regn_number, speed, color, owner_name):
        self.regn_number = regn_number
        self.speed = speed
        self.color = color
        self.owner_name = owner_name

    def show_data(self):
        print("This is a vehicle class")


class Bus(Vehicle):
    def __init__(self, regn_number, speed, color, owner_name, route_number):
        super().__init__(regn_number, speed, color, owner_name)
        self.route_number = route_number

    def show_data(self):
        super().show_data()
        print(f"Route Number: {self.route_number}")
        print(f"Registration Number: {self.regn_number}")
        print(f"Speed: {self.speed}")
        print(f"Color: {self.color}")
        print(f"Owner Name: {self.owner_name}")


class Car(Vehicle):
    def __init__(self, regn_number, speed, color, owner_name, manufacturer_name):
        super().__init__(regn_number, speed, color, owner_name)
        self.manufacturer_name = manufacturer_name

    def show_data(self):
        super().show_data()
        print(f"Manufacturer Name: {self.manufacturer_name}")
        print(f"Registration Number: {self.regn_number}")
        print(f"Speed: {self.speed}")
        print(f"Color: {self.color}")
        print(f"Owner Name: {self.owner_name}")


def main():
    print("Enter details for Bus:")
    bus_regn_number = input("Registration Number: ")
    bus_speed = int(input("Speed: "))
    bus_color = input("Color: ")
    bus_owner_name = input("Owner Name: ")
    bus_route_number = input("Route Number: ")
    my_bus = Bus(
        bus_regn_number, bus_speed, bus_color, bus_owner_name, bus_route_number
    )

    print("\nDetails of Bus:")
    my_bus.show_data()

    print("\nEnter details for Car:")
    car_regn_number = input("Registration Number: ")
    car_speed = int(input("Speed: "))
    car_color = input("Color: ")
    car_owner_name = input("Owner Name: ")
    car_manufacturer_name = input("Manufacturer Name: ")
    my_car = Car(
        car_regn_number, car_speed, car_color, car_owner_name, car_manufacturer_name
    )

    print("\nDetails of Car:")
    my_car.show_data()


if __name__ == "__main__":
    main()
