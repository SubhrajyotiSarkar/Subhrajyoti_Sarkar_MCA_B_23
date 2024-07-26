import threading
import time


class MyRunnable:
    def __init__(self):
        self._running = True

    def terminate(self):
        self._running = False

    def run(self):
        while self._running:
            print("Thread is running...")
            time.sleep(0.5)
        print("Thread has stopped.")


def main():
    my_runnable = MyRunnable()
    thread = threading.Thread(target=my_runnable.run)
    thread.start()

    time.sleep(2)
    my_runnable.terminate()
    thread.join()


if __name__ == "__main__":
    main()
