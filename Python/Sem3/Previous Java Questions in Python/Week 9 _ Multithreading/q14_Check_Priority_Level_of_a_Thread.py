import threading


class MyRunnable:
    def run(self):
        print(f"{threading.current_thread().name} is running...")


def main():
    thread = threading.Thread(target=MyRunnable().run, name="MyThread")
    print(f"Thread name: {thread.name}")


if __name__ == "__main__":
    main()
