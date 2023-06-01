package genericimplementation;

public class Tester {
    public static void main(String[] args) {
        EmployeeList<String> list = new EmployeeList<>();

        list.add("Usman", "123Exz");
        list.addAt(1, "Mahmud", "12_xx&_12");

        list.displayList();
    }
}
