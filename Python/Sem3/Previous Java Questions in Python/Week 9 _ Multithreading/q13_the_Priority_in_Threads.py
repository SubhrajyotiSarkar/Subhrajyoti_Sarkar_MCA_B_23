import threading


class MyRunnable:
    def run(self):
        print(f"{threading.current_thread().name} is running...")


def main():
    thread1 = threading.Thread(target=MyRunnable().run, name="Thread 1")
    thread2 = threading.Thread(target=MyRunnable().run, name="Thread 2")
    thread3 = threading.Thread(target=MyRunnable().run, name="Thread 3")

    thread1.start()
    thread2.start()
    thread3.start()

    print(f"{thread1.name} priority: {thread1.name}")
    print(f"{thread2.name} priority: {thread2.name}")
    print(f"{thread3.name} priority: {thread3.name}")


if __name__ == "__main__":
    main()
