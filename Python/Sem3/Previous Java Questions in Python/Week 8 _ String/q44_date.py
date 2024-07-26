from datetime import datetime


def is_valid_date_format(date_str, format):
    try:
        datetime.strptime(date_str, format)
        return True
    except ValueError:
        return False


def main():
    input_date = input("Enter a date (in format yyyy-MM-dd): ")

    if is_valid_date_format(input_date, "%Y-%m-%d"):
        print("The date is in proper format.")
    else:
        print("The date is not in proper format.")


if __name__ == "__main__":
    main()
