from abc import ABC, abstractmethod


class MyInterface(ABC):
    @abstractmethod
    def display(self):
        pass


class MyExtendedInterface(MyInterface):
    @abstractmethod
    def show(self):
        pass


class CheckThreadAliveOrNot(MyExtendedInterface):
    def display(self):
        print("Display method implementation")

    def show(self):
        print("Show method implementation")


def main():
    example = CheckThreadAliveOrNot()
    example.display()
    example.show()


if __name__ == "__main__":
    main()
