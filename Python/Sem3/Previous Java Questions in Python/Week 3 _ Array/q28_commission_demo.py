class Commission:
    def __init__(self, sales):
        self.sales = sales

    def commission(self):
        if self.sales < 0:
            return -1
        else:
            return self.sales * 0.10


def main():
    try:
        sales = float(input("Enter The Sales Amount: "))

        if sales < 0:
            print("Invalid Input")
        else:
            comm = Commission(sales)
            amt = comm.commission()

            if amt == -1:
                print("Invalid Input")
            else:
                print(f"Commission: Rs. {amt:0.2f}")
    except ValueError:
        print("Invalid Input")


if __name__ == "__main__":
    main()
