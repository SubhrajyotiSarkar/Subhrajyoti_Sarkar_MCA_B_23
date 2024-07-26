from abc import ABC, abstractmethod


class Mango(ABC):
    @abstractmethod
    def display_type(self):
        pass


class Winter(Mango):
    def display_type(self):
        print("This is a Winter Mango.")


class Summer(Mango):
    def display_type(self):
        print("This is a Summer Mango.")


def main():
    winter_mango = Winter()
    summer_mango = Summer()
    winter_mango.display_type()
    summer_mango.display_type()


if __name__ == "__main__":
    main()
