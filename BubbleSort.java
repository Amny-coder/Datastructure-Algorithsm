public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] a = { 2, 1, 3, 8, 0};
        bubbleSort.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * Sort elements using bubble sort technique
     */

    public void sort(int... a) {
        if (a != null) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[i]) {
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }

    }
}
