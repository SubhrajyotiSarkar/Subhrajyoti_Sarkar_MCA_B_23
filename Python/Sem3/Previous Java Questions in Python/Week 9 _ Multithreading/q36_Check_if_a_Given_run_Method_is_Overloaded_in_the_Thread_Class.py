import threading


class MyRunnable:
    def run(self, message=None):
        if message is None:
            print("run() method is called without arguments.")
        else:
            print(f"run() method is called with message: {message}")


def main():
    my_runnable = MyRunnable()
    thread = threading.Thread(target=my_runnable.run)
    thread.start()
    thread.join()

    my_runnable.run("Hello, World!")

    print("\nNote: In Python, we don't have method overloading like in Java.")
    print(
        "Instead, we can use default arguments or *args/**kwargs to achieve similar functionality."
    )


if __name__ == "__main__":
    main()
