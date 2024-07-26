import inspect


class SynchronizedClass:
    def synchronized_method(self):
        print("Synchronized method is being executed.")

    synchronized_method._synchronized = True

    def non_synchronized_method(self):
        print("Non-Synchronized method is being executed.")


def is_method_synchronized(method):
    return hasattr(method, "_synchronized") and method._synchronized


def main():
    methods = inspect.getmembers(SynchronizedClass, predicate=inspect.isfunction)
    for name, method in methods:
        print(f"Method: {name}")
        is_synchronized = is_method_synchronized(method)
        print(f"Synchronized: {'Yes' if is_synchronized else 'No'}")


if __name__ == "__main__":
    main()
