import threading

class MyRunnable:
    def run(self):
        print(f"Thread name: {threading.current_thread().name}")

def main():
    thread = threading.Thread(target=MyRunnable().run)
    thread.name = "MyThread"
    thread.start()

if __name__ == "__main__":
    main()
