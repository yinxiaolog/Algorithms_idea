package chapter1.chapter1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise1209 {
    public static int rank(int key, int[] a, Counter counter) {
        int low = 0;
        int high = a.length - 1;
        counter.increment();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < a[mid])
                high = mid - 1;
            else if (key > a[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        Counter counter = new Counter("Head");
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist, counter) == -1)
                StdOut.println(key);
        }

        StdOut.println(counter.toString());
    }
}