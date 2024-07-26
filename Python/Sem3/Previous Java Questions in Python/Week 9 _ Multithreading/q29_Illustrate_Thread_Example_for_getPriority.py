import threading


class MyRunnable:
    def run(self):
        print("Thread is running...")


def main():
    thread = threading.Thread(target=MyRunnable().run)
    print(f"Thread name: {thread.name}")


if __name__ == "__main__":
    main()
