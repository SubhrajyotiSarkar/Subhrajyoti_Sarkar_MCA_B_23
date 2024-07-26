import threading
import time


class A(threading.Thread):
    def run(self):
        for i in range(5):
            try:
                time.sleep(0.5)
            except Exception as e:
                print(e)
            print(i)


if __name__ == "__main__":
    t1 = A()
    t2 = A()

    t1.start()
    t2.start()
