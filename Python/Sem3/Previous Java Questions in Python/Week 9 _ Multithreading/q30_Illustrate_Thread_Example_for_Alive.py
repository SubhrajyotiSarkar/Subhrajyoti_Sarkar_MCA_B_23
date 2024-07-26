import threading
import time

class MyRunnable:
    def run(self):
        print("Thread is running...")
        time.sleep(0.1)

def main():
    thread = threading.Thread(target=MyRunnable().run)
    print(f"Thread is alive before starting: {thread.is_alive()}")
    thread.start()
    print(f"Thread is alive after starting: {thread.is_alive()}")
    thread.join()
    print(f"Thread is alive after finishing: {thread.is_alive()}")

if __name__ == "__main__":
    main()
