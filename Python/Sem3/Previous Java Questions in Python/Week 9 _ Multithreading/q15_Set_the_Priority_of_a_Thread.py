import threading

class MyRunnable:
    def run(self):
        print(f"{threading.current_thread().name} is running")

def main():
    thread = threading.Thread(target=MyRunnable().run, name="MyThread")
    thread.start()
    print(f"{thread.name} has started")

if __name__ == "__main__":
    main()
