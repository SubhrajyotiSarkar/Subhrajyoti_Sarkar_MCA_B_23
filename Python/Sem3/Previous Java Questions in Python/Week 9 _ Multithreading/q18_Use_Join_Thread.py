import threading
import time


class MyRunnable:
    def run(self):
        print(f"{threading.current_thread().name} is running...")
        time.sleep(2)
        print(f"{threading.current_thread().name} finished.")


def main():
    thread1 = threading.Thread(target=MyRunnable().run, name="Thread 1")
    thread2 = threading.Thread(target=MyRunnable().run, name="Thread 2")

    thread1.start()
    thread1.join()
    print("Thread 1 has finished.")

    thread2.start()


if __name__ == "__main__":
    main()
