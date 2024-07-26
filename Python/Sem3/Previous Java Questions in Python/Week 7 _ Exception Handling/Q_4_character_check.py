class CharacterCheck:
    def __init__(self):
        self.total_alphabetic_characters = 0

    def add_character(self, c):
        if not c.isalpha():
            raise ValueError(f"Non-alphabetic character passed: {c}")
        self.total_alphabetic_characters += 1

    def get_total_alphabetic_characters(self):
        return self.total_alphabetic_characters


def main():
    counter = CharacterCheck()
    try:
        counter.add_character("a")
        counter.add_character("b")
        counter.add_character("1")
    except ValueError as e:
        print(str(e))

    print(f"Total alphabetic characters: {counter.get_total_alphabetic_characters()}")


if __name__ == "__main__":
    main()
