
public class InsersionSort {

    /**
     * The method uses an insertion technique to sort
     * an elements of the array in ascending order.
     *
     * The algorithm runs on O(n^2) at worse case and
     * O(n) at best case.
     * @param a an array of elements.
     */
    public void sorting(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > x) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = x;
        }
    }
}
