class Vehicle:
    def __init__(self, id, name, license_number):
        self.id = id
        self.name = name
        self.license_number = license_number

    def get_id(self):
        return self.id

    def get_name(self):
        return self.name

    def get_license_number(self):
        return self.license_number


class TwoWheeler(Vehicle):
    def __init__(self, id, name, license_number, steering_handle):
        super().__init__(id, name, license_number)
        self.steering_handle = steering_handle

    def get_steering_handle(self):
        return self.steering_handle


class FourWheeler(Vehicle):
    def __init__(self, id, name, license_number, steering_wheel):
        super().__init__(id, name, license_number)
        self.steering_wheel = steering_wheel

    def get_steering_wheel(self):
        return self.steering_wheel


def main():
    print("Enter Two-Wheeler details:")
    two_wheeler_id = int(input("ID: "))
    two_wheeler_name = input("Name: ")
    two_wheeler_license_number = input("License Number: ")
    two_wheeler_steering_handle = input("Steering Handle: ")

    two_wheeler = TwoWheeler(
        two_wheeler_id,
        two_wheeler_name,
        two_wheeler_license_number,
        two_wheeler_steering_handle,
    )

    print("\nEnter Four-Wheeler details:")
    four_wheeler_id = int(input("ID: "))
    four_wheeler_name = input("Name: ")
    four_wheeler_license_number = input("License Number: ")
    four_wheeler_steering_wheel = input("Steering Wheel: ")

    four_wheeler = FourWheeler(
        four_wheeler_id,
        four_wheeler_name,
        four_wheeler_license_number,
        four_wheeler_steering_wheel,
    )

    print("\nTwo-Wheeler Details:")
    print(f"ID: {two_wheeler.get_id()}")
    print(f"Name: {two_wheeler.get_name()}")
    print(f"License Number: {two_wheeler.get_license_number()}")
    print(f"Steering Handle: {two_wheeler.get_steering_handle()}")

    print("\nFour-Wheeler Details:")
    print(f"ID: {four_wheeler.get_id()}")
    print(f"Name: {four_wheeler.get_name()}")
    print(f"License Number: {four_wheeler.get_license_number()}")
    print(f"Steering Wheel: {four_wheeler.get_steering_wheel()}")


if __name__ == "__main__":
    main()
