package genericimplementation;

public class Tester {
    public static void main(String[] args) {
        SinglyLinkedList<String> name = new SinglyLinkedList<>();

        name.add("Amir");
        name.add("Mahmud");
        name.add("Usman");
        name.add("Baba");
        name.addAt(3, "Abdul");

        name.remove();
        name.removeAt(0);

        name.show();
        System.out.println(name.size() + " " + name.isEmpty());
    }
}
