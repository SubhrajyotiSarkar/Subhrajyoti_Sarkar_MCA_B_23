def main():
    ar = []
    print("Enter Sales for The Week: ")
    for _ in range(7):
        ar.append(float(input()))

    sum_sales = sum(ar)
    print(f"Average: {sum_sales / 7}")


if __name__ == "__main__":
    main()
