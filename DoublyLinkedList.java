public class DoublyLinkedList {

    private DllNode list;
    private int size;

    /**
     * Add element to the list, and initialize a reference
     * to the previous node so that the list contains
     * both reference to the next and previous node.
     */

    public void add(int data) {
        DllNode node = new DllNode();
        node.data = data;
        node.next = null;

        if (list == null) {
            list = node;
        }
        else {
            DllNode n = list;

            while (n.next !=  null) {
                n = n.next;
            }
            n.next = node;
            node.prev = n.next;
        }
        size++;
    }

    /**
     * Add node at the head of the list
     */

    public void addToStart(int data) {
        DllNode node = new DllNode();
        node.data = data;
        node.next = list;
        list = node;
        list.prev = list;

        size++;
    }

    /**
     * Add a node at the specified position
     */

    public void addAt(int index, int data) {
        DllNode node = new DllNode();
        node.data = data;

        try {
            if (index == 0) {
                addToStart(data);
            } else {
                DllNode n = list;

                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;
                node.prev = n.next;
            }
            size++;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error invalid index");
        }
    }

    /**
     * Delete a node, start the deletion from the head
     */

    public void delete() {
        if (list != null) {
            list = list.next;
        }
        size--;
    }

    /**
     * Delete the node at the specified position using
     * the index number
     */

    public void deleteAt(int index) {
        DllNode n1 = list;

        if (list == null) {
            System.out.println("Can not delete an empty list");
        }
        else {
            if (index == 0) {
                delete();
            }
            else {
                for (int i = 0; i < index - 1; i++) {
                    n1 = n1.next;
                }
                list = n1.next;
            }
        }
        size--;
    }

    /**
     * Returns the size of the list
     */

    public int size() {return size;}

    /**
     * Returns true if the list is empty otherwise false
     */

    public boolean isEmpty() {return (size == 0);}

    /**
     * output all the elements on the list including
     * reference to the next and the previous nodes.
     */

    public void show() {

        try {
            DllNode n2 = list;
            while (n2.next != null) {
                System.out.println(n2.data);
                System.out.println();

                System.out.println("Address of the next node" + n2.next);
                System.out.println("Address of the previous node: " + n2.prev);

                n2 = n2.next;
            }
            System.out.println(n2.data);
            System.out.println("Address of the next node: " + n2.next);
            System.out.println("Address of the previous node: " + n2.prev);
        } catch (NullPointerException e) {
            System.out.println("Can not display the list because the list is empty");
        }
    }

    private static class DllNode {
        public int data;
        public DllNode next;
        public DllNode prev;
    }
}
