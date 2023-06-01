/**
 *
 */
public class SinglyLinkedList {

    private Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        }
        else {
            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void addFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            addFirst(data);
        }
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void delete() {
        head = head.next;
    }

    public void deleteAt(int index) {
        Node node = new Node();
        node.next = null;

        if (index == 0) {
            delete();
        }
        else {
            Node n1 = head;
            for (int i = 0; i < index - 1; i++) {
                n1 = n1.next;
            }
            node.next = n1.next;
            head = node.next;
        }
    }

    public void show() {
        Node out = head;

        while (out.next != null) {
            System.out.println(out.data);
            out = out.next;
        }
        System.out.println(out.data);
    }

    private static class Node {
        protected int data;
        protected Node next;
    }
}
