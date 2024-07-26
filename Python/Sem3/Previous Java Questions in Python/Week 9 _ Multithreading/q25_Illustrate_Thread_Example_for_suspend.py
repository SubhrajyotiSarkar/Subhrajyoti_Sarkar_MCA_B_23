import threading
import time


class MyThread(threading.Thread):
    def __init__(self):
        super().__init__()
        self.suspended = False
        self.suspend_lock = threading.Lock()
        self.suspend_condition = threading.Condition(self.suspend_lock)

    def run(self):
        while True:
            with self.suspend_condition:
                while self.suspended:
                    self.suspend_condition.wait()
                print("Thread is running...")
            time.sleep(1)

    def suspend_thread(self):
        self.suspended = True

    def resume_thread(self):
        with self.suspend_condition:
            self.suspended = False
            self.suspend_condition.notify()


def main():
    thread = MyThread()
    thread.start()

    time.sleep(5)

    thread.suspend_thread()
    print("Thread suspended for 3 seconds...")
    time.sleep(3)

    thread.resume_thread()
    print("Thread resumed...")

    time.sleep(5)
    thread.suspend_thread()


if __name__ == "__main__":
    main()
