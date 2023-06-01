
public class Main {
    public static void main(String[] args) {
        int[] a = {2, 1, 8, 0, -1};

        InsersionSort insersionSort = new InsersionSort();
        insersionSort.sorting(a);

        for (int k = 0; k < a.length; k++)
            System.out.print(a[k] + " ");
    }
}