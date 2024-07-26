class Building:
    def __init__(self, floors, rooms, footage):
        self.floors = floors
        self.rooms = rooms
        self.footage = footage

    def display(self):
        print(f"Number of Floors: {self.floors}")
        print(f"Number of Rooms: {self.rooms}")
        print(f"Total Footage: {self.footage} sqft")


class House(Building):
    def __init__(self, floors, rooms, footage, bedrooms, bathrooms):
        super().__init__(floors, rooms, footage)
        self.bedrooms = bedrooms
        self.bathrooms = bathrooms

    def display(self):
        super().display()
        print(f"Number of Bedrooms: {self.bedrooms}")
        print(f"Number of Bathrooms: {self.bathrooms}")


def main():
    print("Enter details for Building:")
    floors = int(input("Number of Floors: "))
    rooms = int(input("Number of Rooms: "))
    footage = float(input("Total Footage: "))

    print("\nEnter details for House:")
    bedrooms = int(input("Number of Bedrooms: "))
    bathrooms = int(input("Number of Bathrooms: "))

    b = Building(floors, rooms, footage)
    h = House(floors, rooms, footage, bedrooms, bathrooms)

    print("\nDetails of Building:")
    b.display()
    print("\nDetails of House:")
    h.display()


if __name__ == "__main__":
    main()
