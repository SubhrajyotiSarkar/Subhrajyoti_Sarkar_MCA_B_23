import threading


class MyRunnable:
    def run(self):
        print(f"{threading.current_thread().name} is running")


def main():
    thread1 = threading.Thread(target=MyRunnable().run, name="Thread 1")
    thread2 = threading.Thread(target=MyRunnable().run, name="Thread 2")

    thread1.start()
    thread2.start()

    print(f"{thread1.name} is running")
    print(f"{thread2.name} is running")


if __name__ == "__main__":
    main()
