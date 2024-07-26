import threading


def thread_function():
    print(f"{threading.current_thread().name} is running")


def main():
    threads = []
    for i in range(1, 5):
        t = threading.Thread(target=thread_function, name=f"Thread {i}")
        threads.append(t)

    threads[0].start()
    threads[1].start()
    threads[2].start()
    threads[3].start()


if __name__ == "__main__":
    main()
