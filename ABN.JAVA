import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackThread extends Thread {
    private Stack<Integer> stack;
    private int threadNumber;

    public StackThread(Stack<Integer> stack, int threadNumber) {
        this.stack = stack;
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println("Thread " + threadNumber + " pushed: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            int popped = stack.pop();
            System.out.println("Thread " + threadNumber + " popped: " + popped);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class QueueThread extends Thread {
    private Queue<Integer> queue;
    private int threadNumber;

    public QueueThread(Queue<Integer> queue, int threadNumber) {
        this.queue = queue;
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            queue.add(i);
            System.out.println("Thread " + threadNumber + " added: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            int dequeued = queue.remove();
            System.out.println("Thread " + threadNumber + " dequeued: " + dequeued);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'stack' or 'queue':");
        String input = scanner.nextLine();
        if (input.equals("stack")) {
            Stack<Integer> stack = new Stack<>();
            StackThread stackThread1 = new StackThread(stack, 1);
            StackThread stackThread2 = new StackThread(stack, 2);
            stackThread1.start();
            stackThread2.start();
        } else if (input.equals("queue")) {
            Queue<Integer> queue = new LinkedList<>();
            QueueThread queueThread1 = new QueueThread(queue, 1);
            QueueThread queueThread2 = new QueueThread(queue, 2);
            queueThread1.start();
            queueThread2.start();
        } else {
            System.out.println("Invalid input.");
        }
    }
}