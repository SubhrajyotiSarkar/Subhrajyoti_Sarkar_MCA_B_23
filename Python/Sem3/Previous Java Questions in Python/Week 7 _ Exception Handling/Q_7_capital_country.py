import sys


class NoMatchFoundException(Exception):
    pass


def create_capital_map():
    return {"France": "Paris", "Germany": "Berlin", "Italy": "Rome", "Spain": "Madrid"}


def main():
    if len(sys.argv) != 2:
        print("Please provide a country name as a command line argument.")
        return

    country_name = sys.argv[1]
    capitals = create_capital_map()

    try:
        capital = capitals.get(country_name)
        if capital is None:
            raise NoMatchFoundException(f"No capital found for country: {country_name}")
        print(f"The capital of {country_name} is {capital}")
    except NoMatchFoundException as e:
        print(str(e))


if __name__ == "__main__":
    main()
