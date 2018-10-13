package chapter1.chapter1_2;

public class Accumulator {
    private double total;
    private int N;

    public void addDateValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }

}
