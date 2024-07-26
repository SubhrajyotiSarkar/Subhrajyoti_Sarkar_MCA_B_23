import threading

counter = 0
lock = threading.Lock()


class MyRunnable:
    def run(self):
        global counter
        with lock:
            for _ in range(1000):
                counter += 1


def main():
    thread1 = threading.Thread(target=MyRunnable().run, name="Thread 1")
    thread2 = threading.Thread(target=MyRunnable().run, name="Thread 2")

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()

    print(f"Final count: {counter}")


if __name__ == "__main__":
    main()
