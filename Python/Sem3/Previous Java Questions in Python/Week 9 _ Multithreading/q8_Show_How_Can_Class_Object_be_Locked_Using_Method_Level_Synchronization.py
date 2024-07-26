import threading
import time


class MyClass:
    def __init__(self):
        self.lock = threading.Lock()

    def synchronized_method(self):
        with self.lock:
            print(
                f"{threading.current_thread().name} is executing synchronized method."
            )
            time.sleep(2)


my_class = MyClass()


def run_thread():
    my_class.synchronized_method()


def main():
    thread1 = threading.Thread(target=run_thread, name="Thread 1")
    thread2 = threading.Thread(target=run_thread, name="Thread 2")

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()


if __name__ == "__main__":
    main()
