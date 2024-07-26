import threading


class MyRunnable:
    def run(self):
        print("Thread is running...")


def main():
    my_runnable = MyRunnable()
    thread = threading.Thread(target=my_runnable.run)
    thread.start()


if __name__ == "__main__":
    main()
