package genericimplementation;

public class SinglyLinkedList<T> implements List<T>{
    private Node<T> list;
    private int counter;

    @Override
    public void add(T data) {
       Node<T> node = new Node<>();
        node.data = data;
        node.next = list;
        list = node;

        counter++;
    }

    @Override
    public void addAt(int index, T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;

        try {
            if (index == 0) {
                add(data);
            } else {
                Node<T> node1 = list;

                for (int i = 0; i < index - 1; i++) {
                    node1 = node1.next;
                }
                node.next = node1.next;
                node1.next = node;
            }
        } catch (NullPointerException e) {
            System.out.println("Index out of bound");
        }

        counter++;
    }

    @Override
    public void remove() {
        list = list.next;
        counter--;
    }

    @Override
    public void removeAt(int index) {
       Node<T> node = new Node<>();
       node.next = null;

       try {
           if (index == 0) {
               remove();
           } else {
               Node<T> n1 = list;
               for (int i = 0; i < index - 1; i++) {
                   n1 = n1.next;
               }
               node.next = n1.next;
               n1.next = node;
           }
       } catch (NullPointerException e) {
           System.out.println("Error trying to access with invalid index");
       }

       counter--;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean isEmpty() {
        return (counter == 0);
    }

    @Override
    public void show() {
        Node<T> n = list;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
   }

   private static class Node<T> {
        T data;
        Node<T> next;
   }
}
