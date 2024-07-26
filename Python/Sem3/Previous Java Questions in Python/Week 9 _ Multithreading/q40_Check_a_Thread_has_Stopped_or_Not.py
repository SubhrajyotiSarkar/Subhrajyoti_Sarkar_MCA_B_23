import threading
import time


class TestJoinMethod3(threading.Thread):
    def run(self):
        for i in range(4):
            try:
                time.sleep(0.5)
            except Exception as e:
                print(e)
            print(i)


if __name__ == "__main__":
    t1 = TestJoinMethod3()
    t2 = TestJoinMethod3()
    t3 = TestJoinMethod3()

    t1.start()
    t1.join()

    t2.start()
    t3.start()
