from abc import ABC, abstractmethod


class Player(ABC):
    @abstractmethod
    def play(self):
        pass


class Child(Player):
    def play(self):
        print("For a child, playing means having fun and enjoying activities.")


class Musician(Player):
    def play(self):
        print(
            "For a musician, playing means performing music with instruments or vocals."
        )


class Actor(Player):
    def play(self):
        print(
            "For an actor, playing means performing roles in theater, film, or television."
        )


def main():
    print("Choose a player to learn about their definition of 'play':")
    print("1. Child")
    print("2. Musician")
    print("3. Actor")
    choice = int(input("Enter your choice: "))

    if choice == 1:
        player = Child()
    elif choice == 2:
        player = Musician()
    elif choice == 3:
        player = Actor()
    else:
        print("Invalid choice.")
        return

    player.play()


if __name__ == "__main__":
    main()
