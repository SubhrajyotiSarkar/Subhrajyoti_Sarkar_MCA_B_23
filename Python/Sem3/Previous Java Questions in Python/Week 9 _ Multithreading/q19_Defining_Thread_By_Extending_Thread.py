import threading

class MyThread(threading.Thread):
    def run(self):
        print("Thread is running...")

def main():
    thread = MyThread()
    thread.start()

if __name__ == "__main__":
    main()
