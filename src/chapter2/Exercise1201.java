package chapter2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

public class Exercise1201 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] arrayP = new Point2D[N];

        Interval1D xinterval = new Interval1D(0, 1);
        Interval1D yinterval = new Interval1D(1, 1);
        Interval2D box = new Interval2D(xinterval, yinterval);
        box.draw();

        for (int n = 0; n < N; n++) {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);
            arrayP[n] = p;
            p.draw();
        }

        double distance = 1.732;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                double temp = Math.sqrt(Math.pow((arrayP[i].x() - arrayP[j].x()), 2)
                        + Math.pow((arrayP[i].x() - arrayP[j].x()), 2));
                if (temp < distance) {
                    distance = temp;
                }
            }
        }

        StdOut.println(distance);
    }
}
