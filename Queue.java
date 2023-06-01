public class Queue {
    private static final int SIZE = 5;
    private String[] arr = new String[SIZE];
    private int front;
    private  int rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    private boolean isEmpty() {
        return (front == 0 && rear == -1);
    }
}
