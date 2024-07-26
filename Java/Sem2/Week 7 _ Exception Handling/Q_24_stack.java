class PushException extends Exception {
    public PushException(String message) {
        super(message);
    }
}

class PopException extends Exception {
    public PopException(String message) {
        super(message);
    }
}

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) throws PushException {
        if (isFull()) {
            throw new PushException("Stack is full. Cannot push " + value);
        }
        stackArray[++top] = value;
    }

    public int pop() throws PopException {
        if (isEmpty()) {
            throw new PopException("Stack is empty. Cannot pop.");
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class Q_24_stack {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40); 

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop()); 
        } catch (PushException | PopException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
