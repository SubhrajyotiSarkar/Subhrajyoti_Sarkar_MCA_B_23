import threading


class MyRunnable:
    def run(self):
        print("Thread is running...")


def main():
    thread = threading.Thread(target=MyRunnable().run)
    thread.start()


if __name__ == "__main__":
    main()
