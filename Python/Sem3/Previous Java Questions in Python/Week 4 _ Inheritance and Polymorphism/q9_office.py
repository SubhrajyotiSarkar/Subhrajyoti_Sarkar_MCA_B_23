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


class Office(Building):
    def __init__(self, floors, rooms, footage, telephones, tables):
        super().__init__(floors, rooms, footage)
        self.telephones = telephones
        self.tables = tables

    def display(self):
        super().display()
        print(f"Number of Telephones: {self.telephones}")
        print(f"Number of Tables: {self.tables}")


def main():
    print("Enter details for Building:")
    floors = int(input("Number of Floors: "))
    rooms = int(input("Number of Rooms: "))
    footage = float(input("Total Footage: "))

    print("\nEnter details for House:")
    bedrooms = int(input("Number of Bedrooms: "))
    bathrooms = int(input("Number of Bathrooms: "))

    print("\nEnter details for Office:")
    telephones = int(input("Number of Telephones: "))
    tables = int(input("Number of Tables: "))

    b = Building(floors, rooms, footage)
    h = House(floors, rooms, footage, bedrooms, bathrooms)
    o = Office(floors, rooms, footage, telephones, tables)

    print("\nDetails of Building:")
    b.display()
    print("\nDetails of House:")
    h.display()
    print("\nDetails of Office:")
    o.display()


if __name__ == "__main__":
    main()
