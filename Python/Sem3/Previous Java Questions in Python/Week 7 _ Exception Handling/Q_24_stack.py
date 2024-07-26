class PushException(Exception):
    pass


class PopException(Exception):
    pass


class Stack:
    def __init__(self, size):
        self.max_size = size
        self.stack_array = [0] * self.max_size
        self.top = -1

    def push(self, value):
        if self.is_full():
            raise PushException(f"Stack is full. Cannot push {value}")
        self.top += 1
        self.stack_array[self.top] = value

    def pop(self):
        if self.is_empty():
            raise PopException("Stack is empty. Cannot pop.")
        value = self.stack_array[self.top]
        self.top -= 1
        return value

    def is_empty(self):
        return self.top == -1

    def is_full(self):
        return self.top == self.max_size - 1


def main():
    stack = Stack(3)

    try:
        stack.push(10)
        stack.push(20)
        stack.push(30)
        stack.push(40)  # This should raise a PushException

        print(stack.pop())
        print(stack.pop())
        print(stack.pop())
        print(stack.pop())  # This should raise a PopException
    except (PushException, PopException) as e:
        print(f"Caught Exception: {str(e)}")


if __name__ == "__main__":
    main()
