package genericimplementation;

public class EmployeeList<T> {

    private DllNode<T> list;

    /**
     * Add element to the list, and initialize a reference
     * to the previous node so that the list contains
     * both reference to the next and previous node.
     * @param< name, id>
     */

    public void add(String name, T id) {
        DllNode<T> node = new DllNode<>();
        node.name = name;
        node.id = id;
        node.next = list;
        list = node;
        list.prev = list;
    }

    /**
     * Adding the two elements and make a reference to the next
     * node, and also the newly created node has a reference to
     * the previous node.
     * @param< name, id>

    public void addToList(String name, T id) {
        DllNode<T> node = new DllNode<>();
        node.name = name;
        node.id = id;

        if (list == null) {
            add(node.name, node.id);
        }
        else {
            DllNode n = list;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.prev = n.next;
        }
    }
     */

    /**
     * Set up the node and link it at the specified position
     * issued.
     * @param< index, name, id>
     */

    public void addAt(int index, String name, T id) {
        try {
            DllNode<T> node = new DllNode<>();
            node.name = name;
            node.id = id;

            if (index == 0) {
                add(name, id);
            } else {
                DllNode<T> n1 = list;

                for (int i = 0; i < index - 1; i++) {
                    n1 = n1.next;
                }
                node.next = n1.next;
                n1.next = node;
                node.prev = n1.next;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index number provided");

        } catch (IllegalArgumentException e) {
            System.out.println("Requires an integer number you provided " + index);
        }
    }

    /**
     * Iterate through the list by outputting all it
     * element.
     */

    public void displayList() {
        DllNode<T> n2 = list;

        while (n2.next != null) {
            System.out.println(n2.name + " " + n2.id);
            System.out.println();

            System.out.println("Address of the next node" + n2.next);
            System.out.println("Address of the previous node: " + n2.prev);
            n2 = n2.next;
        }
        System.out.println(n2.name + " " + n2.id);
        System.out.println();

        System.out.println("Address of the next node" + n2.next);
        System.out.println("Address of the previous node: " + n2.prev);
    }

    public static class DllNode<T> {
        public String name;
        public T id;
        public DllNode next;
        public DllNode prev;
    }
}
