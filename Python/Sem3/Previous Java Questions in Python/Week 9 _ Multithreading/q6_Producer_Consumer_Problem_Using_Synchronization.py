import threading
import time
from collections import deque


class Buffer:
    def __init__(self, capacity=5):
        self.queue = deque()
        self.capacity = capacity
        self.lock = threading.Lock()
        self.not_full = threading.Condition(self.lock)
        self.not_empty = threading.Condition(self.lock)

    def produce(self):
        for i in range(10):
            with self.not_full:
                while len(self.queue) == self.capacity:
                    self.not_full.wait()
                self.queue.append(i)
                print(f"Produced: {i}")
                self.not_empty.notify()
            time.sleep(1)

    def consume(self):
        for _ in range(10):
            with self.not_empty:
                while not self.queue:
                    self.not_empty.wait()
                consumed = self.queue.popleft()
                print(f"Consumed: {consumed}")
                self.not_full.notify()
            time.sleep(2)


def main():
    buffer = Buffer()
    producer = threading.Thread(target=buffer.produce)
    consumer = threading.Thread(target=buffer.consume)

    producer.start()
    consumer.start()

    producer.join()
    consumer.join()


if __name__ == "__main__":
    main()
