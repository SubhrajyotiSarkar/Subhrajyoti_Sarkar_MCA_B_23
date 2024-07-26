class Distance:
    def __init__(self, distance_in_miles):
        self.distance_in_miles = distance_in_miles

    def travel_time(self):
        time = self.distance_in_miles / 60.0
        print(f"Time taken to cover the distance: {time} hours")


class DistanceMKS(Distance):
    def travel_time(self):
        distance_in_kilometers = self.distance_in_miles * 1.60934
        time = distance_in_kilometers / 100.0
        print(f"Time taken to cover the distance: {time} hours")


def main():
    distance_in_miles = float(input("Enter distance in miles: "))
    distance1 = Distance(distance_in_miles)
    distance2 = DistanceMKS(distance_in_miles)

    print("For Distance:")
    distance1.travel_time()
    print("\nFor DistanceMKS:")
    distance2.travel_time()


if __name__ == "__main__":
    main()
