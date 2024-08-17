package DSA;

public class Stack {

    class Stack1 {
        private int maxSize; 
        private int[] stackArray; 
        private int top; 

        
        public Stack1(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1; 
        }

        
        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push " + value);
            } else {
                stackArray[++top] = value;
                System.out.println("Pushed " + value + " to the stack");
            }
        }

        
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop");
                return -1; 
            } else {
                int value = stackArray[top--];
                System.out.println("Popped " + value + " from the stack");
                return value;
            }
        }

        
        public boolean isEmpty() {
            return (top == -1);
        }

        
        public boolean isFull() {
            return (top == maxSize - 1);
        }

        
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek");
                return -1;
            } else {
                return stackArray[top];
            }
        }

        
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Nothing to display");
            } else {
                System.out.println("Stack elements are:");
                for (int i = top; i >= 0; i--) {
                    System.out.println(stackArray[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Stack outerStack = new Stack();
        Stack1 stack = outerStack.new Stack1(5); 

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();

        System.out.println("Top element is: " + stack.peek());
    }
}
