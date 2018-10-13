package chapter1.chapter1_2;

class VisualCounter {
    private int count = 0;
    private int operations = 0;
    private int N;
    private int max;

    public VisualCounter(int N, int max) {
        this.N = N;
        this.max = max;
    }

    public void increment() {
        operations++;
        if (operations > N || Math.abs(count) > max) {
            return;
        }
        count++;
    }

    public void decrease() {
        operations++;
        if (operations > N || Math.abs(count) > max) {
            return;
        }
        count--;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return count + "";
    }
}
