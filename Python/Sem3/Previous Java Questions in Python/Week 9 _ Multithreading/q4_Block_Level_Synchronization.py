import threading

counter = 0
lock = threading.Lock()


def increment_counter():
    global counter
    for _ in range(1000):
        with lock:
            counter += 1


def main():
    t1 = threading.Thread(target=increment_counter, name="Thread 1")
    t2 = threading.Thread(target=increment_counter, name="Thread 2")

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    print(f"Final count: {counter}")


if __name__ == "__main__":
    main()
