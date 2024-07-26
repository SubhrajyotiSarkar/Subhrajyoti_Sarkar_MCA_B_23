from q10_string_compare import Account
import threading

def main():
    acc1 = Account()
    acc2 = Account()

    def thread1_func():
        for _ in range(1000):
            acc1.transfer(acc2, 10)

    def thread2_func():
        for _ in range(1000):
            acc2.transfer(acc1, 10)

    thread1 = threading.Thread(target=thread1_func)
    thread2 = threading.Thread(target=thread2_func)

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()

    print(f"Balance in Account 1: {acc1.get_balance()}")
    print(f"Balance in Account 2: {acc2.get_balance()}")

if __name__ == "__main__":
    main()
