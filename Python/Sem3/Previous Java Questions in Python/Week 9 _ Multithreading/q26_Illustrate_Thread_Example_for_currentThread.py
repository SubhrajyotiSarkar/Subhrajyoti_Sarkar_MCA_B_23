import threading


def main():
    current_thread = threading.current_thread()
    print(f"Current thread: {current_thread.name}")


if __name__ == "__main__":
    main()
