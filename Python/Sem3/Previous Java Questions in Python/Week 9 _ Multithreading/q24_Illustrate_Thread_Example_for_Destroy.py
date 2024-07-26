import threading
import time


class MyThread(threading.Thread):
    def __init__(self):
        super().__init__()
        self.running = True

    def run(self):
        while self.running:
            try:
                print("Thread is running...")
                time.sleep(1)
            except InterruptedError:
                print("Thread interrupted.")
                break
        print("Thread stopped.")

    def stop_thread(self):
        self.running = False


def main():
    thread = MyThread()
    thread.start()

    time.sleep(5)

    thread.stop_thread()
    thread.join()


if __name__ == "__main__":
    main()
