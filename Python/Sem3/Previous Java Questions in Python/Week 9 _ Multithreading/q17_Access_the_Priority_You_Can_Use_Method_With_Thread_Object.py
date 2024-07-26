import threading


class MyRunnable:
    def run(self):
        print(f"{threading.current_thread().name} is running")


def main():
    thread = threading.Thread(target=MyRunnable().run, name="MyThread")

    print(f"Thread name before setting: {thread.name}")
    print("Simulating setting max priority...")
    print(f"Thread name after setting: {thread.name}")

    thread.start()


if __name__ == "__main__":
    main()
