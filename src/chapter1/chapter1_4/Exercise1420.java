package chapter1.chapter1_4;

public class Exercise1420 {
    public static int localMax(int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
                return mid;
            }
            if (a[mid - 1] > a[mid + 1]) {
                high = mid - 1;
            }
            if (a[mid + 1] > a[mid - 1]) {
                low = mid + 1;
            }
        }

        return 0;
    }

    public static boolean bitonicSearch(int[] a, int key) {
        int localMax = localMax(a);
        boolean isLeft = binarySearch(a, key, 0, localMax) > -1;
        boolean isRight = binarySearchReverse(a, key, localMax + 1, a.length - 1) > -1;
        return isLeft || isRight;
    }

    public static int binarySearch(int[] a, int key, int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchReverse(int[] a, int key, int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 99, 101, 100, 89, 9, 8, 7};
        System.out.println(bitonicSearch(a, 8));
    }
}
