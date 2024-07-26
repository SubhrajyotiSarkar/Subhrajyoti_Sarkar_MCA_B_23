import threading
import time

lock1 = threading.Lock()
lock2 = threading.Lock()


def thread1_func():
    with lock1:
        print("Thread 1: Holding lock 1...")
        time.sleep(0.1)
        print("Thread 1: Waiting for lock 2...")
        with lock2:
            print("Thread 1: Holding lock 1 and lock 2...")


def thread2_func():
    with lock2:
        print("Thread 2: Holding lock 2...")
        time.sleep(0.1)
        print("Thread 2: Waiting for lock 1...")
        with lock1:
            print("Thread 2: Holding lock 1 and lock 2...")


def main():
    thread1 = threading.Thread(target=thread1_func)
    thread2 = threading.Thread(target=thread2_func)

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()


if __name__ == "__main__":
    main()
