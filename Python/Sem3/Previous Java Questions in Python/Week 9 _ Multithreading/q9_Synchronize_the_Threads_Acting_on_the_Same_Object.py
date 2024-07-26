import threading
import time


class SharedObject:
    def __init__(self):
        self.lock = threading.Lock()

    def synchronized_method(self):
        with self.lock:
            print(
                f"{threading.current_thread().name} is executing synchronized method."
            )
            time.sleep(2)


def run_thread(shared_object):
    shared_object.synchronized_method()


def main():
    shared_object = SharedObject()
    thread1 = threading.Thread(
        target=run_thread, args=(shared_object,), name="Thread 1"
    )
    thread2 = threading.Thread(
        target=run_thread, args=(shared_object,), name="Thread 2"
    )

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()


if __name__ == "__main__":
    main()
