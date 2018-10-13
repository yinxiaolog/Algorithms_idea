package chapter2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise1202 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        //int N = 2;
        Interval1D[] interval1DS = new Interval1D[N];

        for (int n = 0; n < N; n++) {
            interval1DS[n] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (interval1DS[i].intersects(interval1DS[j])) {
                    StdOut.print(interval1DS[i]);
                    StdOut.print(interval1DS[j]);
                    StdOut.println();
                }
            }
        }
    }
}
