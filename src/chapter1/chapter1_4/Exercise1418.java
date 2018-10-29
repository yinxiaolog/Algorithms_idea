package chapter1.chapter1_4;

public class Exercise1418 {
    public static int localMin(int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] < a[mid - 1] || a[mid] < a[mid + 1]) {
                return mid;
            } else if (a[mid - 1] < a[mid + 1]) {
                high = mid - 1;
            } else if (a[mid - 1] > a[mid + 1]) {
                low = mid + 1;
            }
        }

        return 0;
    }
}
