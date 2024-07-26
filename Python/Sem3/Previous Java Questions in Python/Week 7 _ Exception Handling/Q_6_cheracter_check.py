class CharacterCounter:
    def __init__(self):
        self.total_count = 0

    def count_character(self, c):
        if not c.isalpha():
            raise ValueError(f"Non-alphabetic character encountered: {c}")
        self.total_count += 1

    def get_total_count(self):
        return self.total_count


def main():
    counter = CharacterCounter()
    input_string = "Subhrajyoti Sarkar 007"

    for c in input_string:
        try:
            counter.count_character(c)
        except ValueError as e:
            print(f"Error: {str(e)}")

    print(f"Total count of alphabetic characters: {counter.get_total_count()}")


if __name__ == "__main__":
    main()
