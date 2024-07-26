from abc import ABC, abstractmethod


class MotorVehicle(ABC):
    def __init__(self, model_name, model_number, model_price):
        self.model_name = model_name
        self.model_number = model_number
        self.model_price = model_price

    @abstractmethod
    def display(self):
        pass


class Car(MotorVehicle):
    def __init__(self, model_name, model_number, model_price, discount_rate):
        super().__init__(model_name, model_number, model_price)
        self.discount_rate = discount_rate

    def display(self):
        print(f"Car Name: {self.model_name}")
        print(f"Model Number: {self.model_number}")
        print(f"Price: ${self.model_price}")
        print(f"Discount Rate: {self.discount_rate}%")

    def discount(self):
        return self.model_price * (self.discount_rate / 100)


def main():
    print("Enter Car details:")
    model_name = input("Model Name: ")
    model_number = int(input("Model Number: "))
    model_price = float(input("Model Price: $"))
    discount_rate = float(input("Discount Rate (%): "))

    car = Car(model_name, model_number, model_price, discount_rate)

    print("\nCar Details:")
    car.display()
    print(f"Discount: ${car.discount():.2f}")


if __name__ == "__main__":
    main()
