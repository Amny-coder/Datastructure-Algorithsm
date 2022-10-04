public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(12);
        list.insert(32);
        list.insert(14);

        //list.deleteAt(1);
        list.insertAt(2, 11);

        list.show();
    }
}