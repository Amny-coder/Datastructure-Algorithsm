public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(2);

        list.addToStart(3);
        //list.addToStart(4);

        list.addAt(0, 45);
        /*list.addAt(1, 50);

        list.delete();
        list.deleteAt(1);*/
        System.out.println("Size of the list: " + list.size());

        if (list.isEmpty())
            System.out.println("Empty list " + list.size());
        list.show();
    }
}