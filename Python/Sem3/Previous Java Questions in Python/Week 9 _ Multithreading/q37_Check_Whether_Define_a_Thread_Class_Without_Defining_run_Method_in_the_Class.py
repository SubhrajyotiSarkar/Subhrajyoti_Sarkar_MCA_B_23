import threading


def main():
    thread = threading.Thread()
    thread.start()
    thread.join()

    print("Note: In Python, creating a Thread without specifying a target function")
    print("or overriding the run() method will result in the thread doing nothing.")
    print(
        "This is different from Java, where not defining a run() method would cause an error."
    )


if __name__ == "__main__":
    main()
