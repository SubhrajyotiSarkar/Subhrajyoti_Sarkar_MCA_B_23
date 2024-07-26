class Vehicle:
    def __init__(self, regn_number, speed, color, owner_name):
        self.regn_number = regn_number
        self.speed = speed
        self.color = color
        self.owner_name = owner_name

    def show_data(self):
        print("This is a vehicle class")
        print(f"Registration Number: {self.regn_number}")
        print(f"Speed: {self.speed}")
        print(f"Color: {self.color}")
        print(f"Owner Name: {self.owner_name}")


class Bus(Vehicle):
    def __init__(self, regn_number, speed, color, owner_name, route_number):
        super().__init__(regn_number, speed, color, owner_name)
        self.route_number = route_number

    def show_data(self):
        super().show_data()
        print(f"Route Number: {self.route_number}")


class Car(Vehicle):
    def __init__(self, regn_number, speed, color, owner_name, manufacturer_name):
        super().__init__(regn_number, speed, color, owner_name)
        self.manufacturer_name = manufacturer_name

    def show_data(self):
        super().show_data()
        print(f"Manufacturer Name: {self.manufacturer_name}")


if __name__ == "__main__":
    print("Enter vehicle details:")
    regn_number = input("Registration Number: ")
    speed = int(input("Speed: "))
    color = input("Color: ")
    owner_name = input("Owner Name: ")

    print("Enter Bus details:")
    route_number = input("Route Number: ")
    bus = Bus(regn_number, speed, color, owner_name, route_number)

    print("\nEnter Car details:")
    manufacturer_name = input("Manufacturer Name: ")
    car = Car(regn_number, speed, color, owner_name, manufacturer_name)

    print("\nBus Details:")
    bus.show_data()

    print("\nCar Details:")
    car.show_data()
