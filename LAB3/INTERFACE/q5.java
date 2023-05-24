interface Stack {
    void push(int data);
    int pop();
    void display();
}

class StackClass implements Stack {
    private int top;
    private int[] stackArray;
    private int maxSize;

    public StackClass(int maxSize) {
        this.top = -1;
        this.stackArray = new int[maxSize];
        this.maxSize = maxSize;
    }

    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Error: Stack overflow");
            return;
        }
        stackArray[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Error: Stack underflow");
            return -1;
        }
        return stackArray[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        StackClass stack = new StackClass(5);
        int choice, value;

        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to be pushed: ");
                    value = Integer.parseInt(System.console().readLine());
                    stack.push(value);
                    break;
                case 2:
                    value = stack.pop();
                    if (value != -1) {
                        System.out.println("Popped value: " + value);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}





         


















    



