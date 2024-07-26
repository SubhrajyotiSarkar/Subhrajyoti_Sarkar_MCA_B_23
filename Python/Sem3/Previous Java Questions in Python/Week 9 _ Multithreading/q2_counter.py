import threading
import time

counter = 0
count1, count2, count3, count4 = 0, 0, 0, 0
lock = threading.Lock()


def run_thread(priority):
    global counter, count1, count2, count3, count4
    for _ in range(10):
        with lock:
            counter += 1
            if priority == 1:
                count1 += 1
            elif priority == 3:
                count2 += 1
            elif priority == 5:
                count3 += 1
            elif priority == 7:
                count4 += 1
            time.sleep(0.01)


def main():
    threads = [
        threading.Thread(target=run_thread, args=(1,)),
        threading.Thread(target=run_thread, args=(3,)),
        threading.Thread(target=run_thread, args=(5,)),
        threading.Thread(target=run_thread, args=(7,)),
    ]

    for t in threads:
        t.start()

    for t in threads:
        t.join()

    print(f"Final count for Thread 1: {count1}")
    print(f"Final count for Thread 2: {count2}")
    print(f"Final count for Thread 3: {count3}")
    print(f"Final count for Thread 4: {count4}")


if __name__ == "__main__":
    main()
