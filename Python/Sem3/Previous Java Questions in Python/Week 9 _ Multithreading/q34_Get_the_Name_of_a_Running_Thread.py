import threading

class MyRunnable:
    def run(self):
        print("Thread is running...")

def main():
    thread = threading.Thread(target=MyRunnable().run, name="MyThread")
    thread.start()
    print(f"Running thread name: {threading.current_thread().name}")

if __name__ == "__main__":
    main()
