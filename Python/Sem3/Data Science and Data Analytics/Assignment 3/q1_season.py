def check_season(month):
    month = month.lower()
    if month in ["december", "january", "february"]:
        return ("Winter", 1)
    elif month in ["march", "april", "may"]:
        return ("Spring", 1)
    elif month in ["june", "july", "august"]:
        return ("Summer", 1)
    elif month in ["september", "october", "november"]:
        return ("Autumn", 1)
    else:
        return ("Invalid month", -1)


while True:
    a = input("Enter Month: ")
    season, temp = check_season(a)
    print(season)
    if temp == -1:
        continue
    else:
        break
